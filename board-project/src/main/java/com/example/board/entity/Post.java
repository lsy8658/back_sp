package com.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;


@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  ) // 번호를 자동으로 1,2,3 채움
    // GenerationType.IDENTITY는 번호(id) 채우는 방식 지정
    private String title;
    private String content;
    private LocalDateTime createAt;
}

