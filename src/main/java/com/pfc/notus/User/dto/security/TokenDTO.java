package com.pfc.notus.user.dto.security;

import java.time.Instant;

public record TokenDTO(String email, String token, Instant createdAt, Instant expiresAt) {

    public TokenDTO(String email, String token, Instant expiresAt) {
        this(email, token, Instant.now(), expiresAt);
    }
}
