package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository; // Service 안에서 Repository를 저장할 변수 선언

    public UserService(UserRepository userRepository) { // 생성자
        this.userRepository = userRepository; // 변수에 주입 : Service가 Repository 사용 가능하게 연결
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}

/*
    변수 선언 = 저장할 공간 준비 (private final UserRepository userRepository;)
    생성자 = 객체 생성과 동시에 Repository 연결 (this.userRepository = userRepository;)
*/
