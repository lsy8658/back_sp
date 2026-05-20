package com.study.sb.apiStudy;

import com.study.sb.apiStudy.dto.MemoDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiParam")
public class MemoRequestParamAndBody {

    // 'http://127.0.0.1:8080/apiParam/requestParamApi?name=홍길동&age=22'
    // 쿼리 스트링 방식
//    @RequestMapping(method= RequestMethod.GET, value="requestParamApi")
//    public List<Map<String, String>> queryParam (
//            @RequestParam(required=false, defaultValue = "이름 없음", value="name") String name,
//            @RequestParam("age") String age,
//            @RequestParam(required=false, defaultValue ="", value="grade") String grade
//    ) {
//        return List.of(
//                Map.of("RequestParam1", name),
//                Map.of("RequestParam2", age),
//                Map.of("RequestParam3", grade)
//        );
//    }
//
//
//    // 제이슨 방식
//    @RequestMapping(method = RequestMethod.POST, value="requestBodyApi")
//    public List<Map<String, String>> requestBody (
//        @RequestBody MemoDTO request
//    ) {
//        return List.of(
//                Map.of("RequestBody1", request.getName()),
//                Map.of("RequestBody2", request.getAge()),
//                Map.of("RequestBody3", request.getGrade())
//        );
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/path1/{id}")
//    public String pathParamRequestMapping(
//            @PathVariable("id") String id
//    ) {
//        return id;
//    }
//
//    @GetMapping("/path2/{id}")
//    public Map<String, String> pathParamGetMapping(
//            @PathVariable("id") String id
//    ) {
//        return Map.of("path-param", id);
//    }
//
//    // Form 방식 (multipart/ form data - 이미지 업로드, 파일 업로드 등 )
//    @RequestMapping(
//            method=RequestMethod.POST,
//            value="/form",
//            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
//    )
//    public List<Map<String, String>> postFormIndex (
//            @ModelAttribute MemoDTO request,
//            @RequestParam(required=false, defaultValue="없음") String query
//    ) {
//        return List.of(Map.of());
//    }
}