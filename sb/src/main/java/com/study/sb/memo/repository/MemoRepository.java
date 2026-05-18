package com.study.sb.memo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemoRepository {
    private final List<String> dataList = List.of("1", "2", "3");

    public List<String> findAll () {
        return this.dataList;
    }
}
// final "한 번 값이 들어가면 다시 바꿀 수 없음"