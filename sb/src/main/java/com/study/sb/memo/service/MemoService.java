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

    // 전체 조회
    public List<Memo> findAll () {
        Optional<List<Memo>> rawData = repository.findAll();

        if (rawData.isEmpty()) {
            return List.of();
        } else {
            return rawData.get();
        }
    }

    // 단일조회
    public Optional<Memo> findOne (long id) {
        return repository.findOne(id);
    }

    // 아이템 추가
    public Memo create (String content) {
        return repository.create(content);
    }

    // 아이템 삭제
    public boolean delete (long id) {
        return repository.delete(id);
    }

    public Optional<Memo> update (long id, String content) {
        return repository.update(id, content);
    }
}

/*

isEmpty() / isPresent(): 상자 안에 알맹이가 있는지 없는지 안전하게 스캔하는 도구.

get(): "나 확인했으니까 에러 안 날 거야, 알맹이 꺼내줘" 하고 꺼내는 도구.

*/