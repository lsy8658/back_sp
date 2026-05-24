package com.study.sb.memo.service;

import com.study.sb.memo.entity.Memo;
import com.study.sb.memo.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MemoService {
    private final MemoRepository repository;

    public MemoService (MemoRepository repo) {
        this.repository = repo;
    }

    public List<Map<String, String>> findAll () {
        Optional<List<Memo>> rawData = this.repository.findAll();
//        if (rawData == null) return
//        return rawData.stream().map((String item) -> {
//            return Map.of("title", item);
//        }).toList();
    }
}
