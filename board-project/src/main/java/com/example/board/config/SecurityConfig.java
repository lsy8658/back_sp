package com.example.board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // 암호화 도구
    }

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) {
        http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/users/signup").permitAll()
                .anyRequest().permitAll()
        );
        return http.build();
    }
}

/*
    @Configuration: "이 클래스는 설정 전용 클래스다"라는 표시.
    여기 안에서 여러 부품(Bean)을 등록할 수 있음.

    @Bean: 이 메소드가 만들어서 반환하는 객체를,
    Spring이 직접 관리하는 부품으로 등록하겠다는 표시.


    http
    .csrf(csrf -> csrf.disable())          // ① CSRF 보안 기능 끔
    .authorizeHttpRequests(auth -> auth    // ② 어떤 주소를 누가 접근 가능한지 규칙 시작
        .requestMatchers("/api/users/signup").permitAll()
        // ③ 회원가입은 로그인 없이 허용
        .anyRequest().permitAll()          // ④ 나머지 요청도 지금은 다 허용 (임시)
    );
    return http.build();                        // ⑤ 이 설정을 완성해서 반환
*/

/*
    "@Configuration이 외부 라이브러리를 가져다 설정한다" → 얼추 맞습니다. 정확히는
    "우리가 직접 못 건드리는 것들(외부 라이브러리 클래스)을 어떻게 만들어 쓸지 정의하는 곳"입니다.

    "@Bean은 그 설정 하나하나를 지정한 것" → 맞습니다. 메소드 하나 = 등록할 부품 하나.

    "자동으로 적용되는거고?" → 여기가 살짝 다릅니다:

    라이브러리를 가져다 쓴다고 저절로 적용되는 게 아니라
    우리가 @Bean 메소드를 직접 써놔야만 적용됩니다
    대신 "실행 시점에 적용되는 타이밍"은 자동입니다 — 앱 켜지는 순간 Spring이 이 메소드들을 알아서 찾아서 실행해줌

    정리: 부품을 만드는 코드는 우리가 직접 씀(수동) / 그 코드를 실행하고 창고에 등록하는 시점은 Spring이 알아서 함(자동).
*/

/*
    PasswordEncoder는 우리가 만든 클래스가 아니라 남의 라이브러리(Spring Security)의 인터페이스입니다.
    @Service, @Repository처럼 우리 클래스에 붙이는 어노테이션이 없어서,
    Spring이 자동으로 못 찾습니다. 그래서 "내가 직접 만들어서 등록해줄게"라고 알려주는 게 @Bean입니다.
*/

/*
    왜 이름표가 필요할까요?
    스프링 내부 시큐리티 프레임워크가 찾으려고:

    스프링 시큐리티 내부 코드에는 "어? 사용자가 등록해 둔 SecurityFilterChain 타입의 빈이 있나?" 하고
    창고를 뒤져서 가져가는 로직이 들어있습니다.

    같은 타입의 빈이 여러 개일 때 구분하려고:

    예를 들어 나중에 보안 설정을 2개 이상 만들어야 할 때, 메서드 이름을 apiFilterChain(),
    webFilterChain()처럼 다르게 지어서 스프링에게 "이건 API용 보안 필터고, 저건 웹 화면용 보안 필터야" 하고
    구분해 주기 위함입니다.
*/