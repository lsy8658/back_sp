package com.example.board.service;

import com.example.board.entity.User;
import com.example.board.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User signUp(User user) {
        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );
        return userRepository.save(user);
    }



}

/*
     PasswordEncoder = 비밀번호를 암호화(해싱)하는 도구,
     실무 필수 (비밀번호를 절대 그대로 DB에 저장하면 안 됨)

     passwordEncoder.encode(...) =
     원본 비밀번호를 암호화된 문자열로 바꿔서 저장
*/