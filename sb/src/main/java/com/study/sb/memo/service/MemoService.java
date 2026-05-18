package com.study.sb.memo.service;

import com.study.sb.memo.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemoService {
    private final MemoRepository repository;

    public MemoService (MemoRepository repo) {
        this.repository = repo;
    }

    public List<Map<String, String>> findAll () {
        List<String> rawData = this.repository.findAll();
        return rawData.stream().map((String item) -> {
            return Map.of("title", item);
        }).toList();
    }
}
