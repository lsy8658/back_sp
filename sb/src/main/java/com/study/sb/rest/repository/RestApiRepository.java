package com.study.sb.rest.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestApiRepository {
    private final List<String> dataList = List.of("하나", "둘", "셋");

    public List<String> findAll () {
        return this.dataList;
    }
}

/*
    DB와 연관되어 있는 부분
*/