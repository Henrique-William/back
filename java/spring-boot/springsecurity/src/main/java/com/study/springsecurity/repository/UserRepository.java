package com.study.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.study.springsecurity.entities.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
