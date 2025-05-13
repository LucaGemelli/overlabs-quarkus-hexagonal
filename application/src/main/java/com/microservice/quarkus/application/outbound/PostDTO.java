package com.microservice.quarkus.application.outbound;

public record PostDTO(Long id, String title, String body, Long userId) {}