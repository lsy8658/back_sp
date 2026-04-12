package com.beStudy.todo.hello.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserInfoRequest {
    private String name;
    private String age;
}

/*
    @Setter 를 같이 해줘야함 @Setter를 해주게되면
    @Getter하게 되면 안나옴 @Setter가 이 값을 설정해주는걸 뜻하기 때문
*/