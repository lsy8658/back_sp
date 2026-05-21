package com.study.sb.memo.entity;

import java.time.ZonedDateTime;

public class Memo {
    private Long id;
    private String content;
    private ZonedDateTime createAt;

    public Memo () {

    }

    public Memo (Long id, String content) {
        this.id = id;
        this.content = content;
        this.createAt = ZonedDateTime.now(); // 현재시간
    }

    public Long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
    public ZonedDateTime getCreateAt () {
        return this.createAt;
    }

    public void setId() {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt (ZonedDateTime createdAt) {
        this.createAt = createdAt;
    }
}
