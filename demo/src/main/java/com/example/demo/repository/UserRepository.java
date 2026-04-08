package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository가 CRUD 기본 메서드 제공
}

//User → 어떤 테이블(Entity)을 다룰지
//Long → 그 테이블의 PK(id) 타입 “id로 찾을 때 타입을 맞추려고 Long을 적는 것”