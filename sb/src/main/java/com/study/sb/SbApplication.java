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

    @Getter = private 값을 밖에서 읽게 해주는 문 자동 생성
*/