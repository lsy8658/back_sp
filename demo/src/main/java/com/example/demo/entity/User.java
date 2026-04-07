package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // DB 테이블과 매핑
public class User {
    @Id // PK
    private Long id;
    private String name;

    // getter/setter는 IDE에서 자동 생성 가능
}