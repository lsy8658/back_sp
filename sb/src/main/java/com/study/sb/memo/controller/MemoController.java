package com.study.sb.memo.controller;

import com.study.sb.memo.dto.AddMemoRequest;
import com.study.sb.memo.entity.Memo;
import com.study.sb.memo.service.MemoService;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/api/memo")
public class MemoController {
    private final MemoService service;

    public MemoController (MemoService service) {
        this.service = service;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Map<String, Object> fetchAll () {
        List<Memo> data = this.service.findAll();
        return Map.of("msg", "getMemoData", "data", data);
    }
/*
@PathVariable 괄호 안에 "id"를 아래처럼 직접 명시해 주면 Swagger가 바로 인식합니다.

Java
public Map<String, Object> findOne(@PathVariable("id") long id)


*/
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Map<String, Object> findItem(@PathVariable("id") long id) {
        Optional<Memo> foundItem = service.findOne(id);

        if (foundItem.isPresent()) {
            // 2차 가공
            return Map.of(
                    "message","성공!",
                    "data", foundItem.get()
            );
        } else {
            return Map.of("message","실패");
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> create(
            @RequestBody AddMemoRequest request
    ) {
        String content = request.getContent();

        Memo createdOne = service.create(content);
        return Map.of(
                "message","추가 성공!",
                "data", createdOne
        );
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public Map<String, Object> delete (@PathVariable("id") long id) {

        boolean deleteId = service.delete(id);
        return Map.of(
                "message",deleteId ? "성공!" : "실패",
                "status", deleteId
        );
    }
}
