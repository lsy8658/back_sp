package com.example.board.service;

import com.example.board.entity.User;
import com.example.board.repository.UserRepository;
import com.example.board.util.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    public UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtUtil jwtUtil
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public User signUp(User user) {
        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );
        return userRepository.save(user);
    }

    public String login(String username, String rawPassword) {
        User user = userRepository.findByUsername(username).orElseThrow();

        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new RuntimeException("비밀번호 불일치");
        }

        return jwtUtil.generateToken(username);
    }

}

/*
     PasswordEncoder = 비밀번호를 암호화(해싱)하는 도구,
     실무 필수 (비밀번호를 절대 그대로 DB에 저장하면 안 됨)

     passwordEncoder.encode(...) =
     원본 비밀번호를 암호화된 문자열로 바꿔서 저장
*/