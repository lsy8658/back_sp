package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
import java.util.List;

@Service // spring이 service로 인식
public class HelloService {
    public String getHello () {
        return "Hello Backend!";
    }
}
