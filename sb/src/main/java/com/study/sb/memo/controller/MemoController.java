package com.study.sb.memo.controller;

import com.study.sb.memo.dto.AddMemoRequest;
import com.study.sb.memo.dto.MemoResponse;
import com.study.sb.memo.dto.UpdateMemoRequest;
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
        List<MemoResponse> data = this.service.findAll();
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
        Optional<MemoResponse> foundItem = service.findOne(id);

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

        MemoResponse createdOne = service.create(content);
        return Map.of(
                "message","추가 성공!",
                "data", createdOne
        );
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public Map<String, Object> delete (@PathVariable("id") long id) {

        boolean deleteId = service.delete(id);
        if (deleteId == true) {
            return Map.of(
                    "message","성공!",
                    "status", deleteId
            );
        } else {
            return Map.of(
                    "message", "실패",
                    "status", deleteId
            );
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/{id}")
    public Map<String, Object> update (@PathVariable("id") long id, @RequestBody
    UpdateMemoRequest request) {
        Optional<MemoResponse> updatedOne = service.update(id, request.getContent());
        if (updatedOne.isPresent()) {
            // isPresent "이 객체 안에 값이 들어있는가?

            return Map.of("message", "수정 성공");

        } else {
            return Map.of("message", "수정 실패 /id => " + id);
        }
    }
}
