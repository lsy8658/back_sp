package com.study.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbApplication.class, args);
	}

}

/*
    ✔️ 관계 정리하면
    @RequestMapping 👉 원조 (모든 HTTP 메서드 가능)
    @GetMapping, @PostMapping, @PatchMapping 👉 편의용 축약 버전
*/
/*
	controller - routing 관련을 다룸
	dto - 데이터 추가 요청 / reponse에 대한 부분
	entity - 모델
	repository - model을 가져올 수 있는 부분
	service - 비즈니스 로직 처리
*/