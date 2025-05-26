package com.study.user_registration.controller;

import com.study.user_registration.dto.RegisterRequest;
import com.study.user_registration.entity.UserEntity;
import com.study.user_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "User already exists";
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setName(request.getName());
        userEntity.setEmail(request.getEmail());
        userEntity.setPassword(passwordEncoder.encode(request.getPassword()));
        userRepository.save(userEntity);

        return "Usuário registrado com sucesso!";

    }

    @PostMapping("/login")
    public String login(@RequestBody RegisterRequest request) {

        UserEntity userEntity = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException(("Usuário não encontrado")));

        if (passwordEncoder.matches(request.getPassword(), userEntity.getPassword())) {
            return "Login bem-sucedido!";
        } else {
            return "Credenciais inválidas";
        }

    }

}
