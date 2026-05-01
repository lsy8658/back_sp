package com.study.sb.apiStudy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/blog-post")


// 얘는 이제 restapi가 아닌겁니다. html page를 열어줄겁니다.
// http://127.0.0.1:8080/api/blog-post/html
public class MemoHtml {
    @RequestMapping(method = RequestMethod.GET, value="/html")
    public String getHtml() {
        return "demo";
    }
}

/*
    이렇게 보여주기 위해선 thymeleaf를 build.gradle에 dependency에 추가해야함
    
    resources > templates > html 파일 작성
*/