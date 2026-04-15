package com.beStudy.todo.param.controller;

import com.beStudy.todo.param.controller.dto.ParamRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/param")
public class ParamController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Map<String, String>> index (
            @RequestParam(required = false, value="query", defaultValue="no value") String query,
            @RequestParam("name") String name,
            @RequestParam("age") String age,
            ParamRequest request
    ) {
        return List.of(
                Map.of("query",query),
                Map.of("name",name),
                Map.of("age",age),
                Map.of("title", request.getTitle()),
                Map.of("content", request.getContent())
        );
    }

    @RequestMapping(method=RequestMethod.POST, value="/json")
    public List<Map<String, String>> postJsonIndex (
           @RequestBody ParamRequest request, @RequestParam(value="query", required=false, defaultValue="no value") String query
    ) {
        return List.of(
                Map.of("title", request.getTitle()),
                Map.of("content", request.getContent()),
                Map.of("query", query)
        );
    }

    @RequestMapping(
            method=RequestMethod.POST,
            value = "/form",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public List<Map<String, String>>postFormIndex (
            @ModelAttribute ParamRequest request,
            @RequestParam(value="query", required = false, defaultValue = "없음") String query
    ) {
        return List.of(
                Map.of("message", "post form index"),
                Map.of("title", request.getTitle()),
                Map.of("content", request.getContent()),
                Map.of("query", query)
        );
    }
}

/*
   근데 위와 같이 쓰면 required 임 그럴  @RequestParam(required=false) 로 해준다 하지만 이 값이 String으로 타입
   지정이  에러가 남 그래서 기본값을 설정해주는게 좋음 defaultValue
   16:30 까지 봤음
*/