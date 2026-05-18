package com.study.sb.rest.service;

import com.study.sb.rest.repository.RestApiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RestApiService {
    private RestApiRepository repository;
    // 👉 “이 클래스 안에 repository라는 변수 하나 만들었음” 공간만 있음 값은 null

    public RestApiService(RestApiRepository repo) { // 서비스 생성시 repository가 주입되어야함
         this.repository = repo; // 그래서 생성자에서 “주입”하는 거임
    }
// 이건 그냥 “repo를 내가 직접 만들지 않고, 외부에서 받아서 쓰겠다”는 뜻이야.

    public List<Map<String, String>> findAll() {
        List<String> rawData = repository.findAll();

        return rawData.stream().map((String item) -> {
            return Map.of("title", item);
        }).toList(); // 데이터 가공
    }
}

/*
    비즈니스 로직을 담당하는 부분
    
    회를 뜨는 가공하는 포장 이런느낌
    즉 service는 repository를 알고있음

    Service 생성 순간 = 완성된 상태

    3. “같아 보이는데 실제로 다른 점”

    ❌ 필드만 선언
    private RestApiRepository repository;
    null 가능
    언제 초기화되는지 모름
    실수하면 바로

    ✅ 생성자 주입
    this.repository = repo;
    생성 시점에 무조건 세팅
    null 상태 존재 X
    안전함
*/