package com.beStudy.todo.hello.controller;

import com.beStudy.todo.hello.dto.UserInfoRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// 서버주소/api/hello
@RestController
@RequestMapping("/api")
public class HelloController {
        @GetMapping
        public String index () {
            return "hello spring~!";
        }
    // 이렇게 둘 다 받는 경우 다음과 같이 작성하면 동작을 안함

    //        @GetMapping("/path1/{id}")

        @GetMapping("/path/{id}/query")
        public List<Map<String, String>> getPathParamAndQueryParam (
                @PathVariable("id") String id,
                @RequestParam("name") String name
        ) {
            return List.of(
                    Map.of("path-param", id),
                    Map.of("name", name)
            );
        }

//        @GetMapping("/path/{id}")
//        public Map<String, String> getPathParam(@PathVariable("id") String id) {
//            return Map.of("path-param", id);
//        }

        @GetMapping("/path/{first}/blog/{second}")
        public List<Map<String, String>> getPathParams(
                @PathVariable("first") String first,
                @PathVariable("second") String second

        ) {
            return List.of(
                    Map.of("path-param", first),
                    Map.of("path-param", second)
            );
        }
        @GetMapping("/user-info")
        public List<Map<String, String>> getQueryParams(
                @RequestParam("name") String name,
                @RequestParam("age") String age
        ) {
            return List.of(
                    Map.of("name", name),
                    Map.of("age", age)
            );
        }

        @GetMapping("/user-info-map")
        public List<Map<String, String>> getQueryParamMap(
                @RequestParam("params") Map<String, String> params
        ) {
            String name = params.get("name");
            String age = params.get("age");
            return List.of(
                    Map.of("name", name),
                    Map.of("age", age)
            );
        }

        @GetMapping("/user-info-request")
        public List<Map<String, String>> getQueryParamMap(
                UserInfoRequest request
        ) {
            String name = request.getName();
            String age = request.getAge();
            return List.of(
                    Map.of("name", name),
                    Map.of("age", age)
            );
        }






        @GetMapping("/hello")
        public String hello () {
            return "hello spring~!";
        }



        @GetMapping("/goodbye")
        public String  goodbye () {
            return "good bye~~";
        }

        @GetMapping("/study")
        public Boolean studyStatus () {
            return true;
        }

        @GetMapping("/list")
        public List<String> getList () {
            return List.of("1", "2", "3");
        }

        @GetMapping("/json")
        public Map<String, String> getJson() {
            return Map.of("message","응답 성공", "status", "200");
        }

        @GetMapping("/jsonList")
        public List<Map<String, String>> getJsonList () {
           return List.of(
                   Map.of("hi","안녕", "grade",  "1"),
                   Map.of("hi2","안녕2", "grade2",  "2"),
                   Map.of("code","3", "status",  "true")
           );
        }


}
