package com.study.sb.study1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class study1 {
    @GetMapping("/")
    public String index () {
        return "공부 시작~~~";
    }

    @GetMapping("/list")
    public List<String> getList () {
        return List.of("나는", "너는");
    }

    @GetMapping("/map")
    public Map<String, String> getJson () {
        return Map.of("나는", "000 입니다.");
    }

    @GetMapping("/listMap")
    public List<Map<String, String>> getListMap () {
        return List.of(
                Map.of("1", "반장", "2", "부반장"),
                Map.of("주번","홍길동")
        );
    }
}
