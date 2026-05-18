package com.study.sb.rest.controller;

import com.study.sb.rest.service.RestApiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/api/rest/blog-post")
public class RestApiController {
    private final RestApiService service;

    public RestApiController(RestApiService service) {
        this.service = service;
    }

//    @ResponseBody
    @RequestMapping(method= RequestMethod.GET, value="/data-list")
    public Map<String, Object> fetchAllDataList() {

        List<Map<String, String>> data = this.service.findAll();

        return Map.of("message", "성공!", "data", data);
    }
}

/*
    사용자에게 도달하는 부분

    어떻게 줄지를 Controller에서 반환 ( html로 줄까여 json으로 줄까여 )
    즉 controller는 service를 알고있음

    3. 여기서 final의 의미
    private final UserService userService;

    👉 뜻:

    한 번 값 넣으면
    다시 바꿀 수 없음
*/