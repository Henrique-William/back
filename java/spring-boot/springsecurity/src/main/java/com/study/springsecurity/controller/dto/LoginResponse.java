package com.study.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
