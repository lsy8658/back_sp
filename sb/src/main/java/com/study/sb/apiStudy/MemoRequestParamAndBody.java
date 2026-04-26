package com.study.sb.apiStudy;

import com.study.sb.apiStudy.dto.MemoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiParam")
public class MemoRequestParamAndBody {

    // 'http://127.0.0.1:8080/apiParam/requestParamApi?name=홍길동&age=22'
    // @RequestParam 은 위처럼 쿼리 스트링으로 들어감
    @RequestMapping(method= RequestMethod.GET, value="requestParamApi")
    public List<Map<String, String>> queryParam (
            @RequestParam(required=false, defaultValue = "이름 없음", value="name") String name,
            @RequestParam("age") String age,
            @RequestParam(required=false, defaultValue ="", value="grade") String grade,
            MemoDTO request
    ) {
        return List.of(
                Map.of("RequestParam1", request.getName()),
                Map.of("RequestParam2", age),
                Map.of("RequestParam3", grade)
        );
    }



    @RequestMapping(method = RequestMethod.POST, value="requestBodyApi")
    public List<Map<String, String>> requestBody (
        @RequestBody MemoDTO request
    ) {
        return List.of(
                Map.of("RequestBody1", request.getName()),
                Map.of("RequestBody2", request.getAge()),
                Map.of("RequestBody3", request.getGrade())
        );
    }

    @RequestMapping(method = RequestMethod.GET, value = "/path1/{id}")
    public String pathParamRequestMapping(
            @PathVariable Long id
    ) {
        return "id: " + id;
    }

    @GetMapping("/path1/{id}")
    public String pathParamGetMapping(
            @PathVariable Long id
    ) {
        return "id: " + id;
    }
}