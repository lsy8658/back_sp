package com.study.sb.memo.repository;

import com.study.sb.memo.entity.Memo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MemoRepository {
    private final List<Memo> memos = new ArrayList<>();

    // 전체 조회
    public Optional<List<Memo>> findAll () {
        return Optional.of(this.memos);
    }

    // 단일 조회
    public Optional<Memo> findOne (long id) {
        return this.memos.stream().filter((Memo item) -> {
            return item.getId() == id;
        }).findAny();
    }

    // 아이템 추화
    public Memo create(String content) {
        long id = memos.size();
        Memo newMemo = new Memo(id, content);
        memos.add(newMemo);
        return newMemo;
    }

    // 아이템 삭제
    public boolean delete (long id) {
       return this.memos.removeIf((Memo item) -> {
           return item.getId() == id;
       });
    }

    // 아이템 수정

}
// final "한 번 값이 들어가면 다시 바꿀 수 없음"

// 6강 16:40

























