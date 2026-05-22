package com.study.sb.memo.controller;

import com.study.sb.memo.service.MemoService;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/memo")
public class MemoController {
    private final MemoService service;
    public MemoController (MemoService service) {
        this.service = service;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Map<String, Object> getMemoDataList () {
        List<Map<String, String>> data = this.service.findAll();
        return Map.of("msg", "getMemoData", "data", data);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Map<String, Object> getItem(@PathVariable String id) {
        return Map.of("message", "성공~!!", "data" , "data");
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> create () {
        return Map.of("message", "추가성공!");
    }

    @ResponseBody
    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public Map<String, Object> deleteItem (@PathVariable String id) {
        return Map.of(id, "삭제" + id);
    }

    @ResponseBody
    @RequestMapping(method=RequestMethod.PATCH, value="/{id}")
    public Map<String, Object> patchData (@PathVariable String id) {
        return Map.of(id, "수정" + id);
    }
}
