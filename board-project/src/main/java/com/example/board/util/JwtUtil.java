package com.example.board.util;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {
    private final SecretKey key = Jwts.SIG.HS256.key().build();

    private final long expirationMs = 1000 * 60 * 60;

    // 토큰 생성

    public String generateToken(String username) {
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + expirationMs))
                .signWith(key)
                .compact();
    }

    public String extractUsername (String token) {
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }
}

/*
     JWT 토큰 구조 (3부분): 헤더.내용.서명

    JwtUtil에서 할 일 2가지:
    ① 로그인 성공 시 토큰 만들기, ② 요청 올 때 그 토큰이 진짜인지 검증
*/