package com.study.sb.memo.service;

import com.study.sb.memo.dto.MemoResponse;
import com.study.sb.memo.entity.Memo;
import com.study.sb.memo.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemoService {
    private final MemoRepository repository;

    public MemoService (MemoRepository repo) {

        this.repository = repo;

    }

    // 전체 조회
    public List<MemoResponse> findAll () {
        Optional<List<Memo>> rawData = repository.findAll();
        
        // 1차 가공 - 비즈니스 로직
        return rawData.map(memos -> memos.stream().map(MemoResponse::from).toList()).orElseGet(List::of);
    }

    // 단일조회
    public Optional<MemoResponse> findOne (long id) {
        Optional<Memo> foundItem = repository.findOne(id);
        return foundItem.map(MemoResponse::from);
    }
    // 아이템 추가
    // 아이템 추가
    public MemoResponse create (String content) {
        return MemoResponse.from(repository.create(content));
    }

    // 아이템 삭제
    public boolean delete (long id) {
        return repository.delete(id);
    }

    // 아이템 수정
    public Optional<MemoResponse> update (long id, String content) {

        Optional<Memo> updatedItem = repository.update(id, content);
        return updatedItem.map(MemoResponse::from);
    }
}
