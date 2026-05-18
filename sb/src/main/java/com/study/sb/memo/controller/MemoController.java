package com.study.sb.memo.controller;

import com.study.sb.memo.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MemoController {
    private final MemoService service;
    public MemoController (MemoService service) {
        this.service = service;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/memo")
    public Map<String, Object> getMemoDataList () {
        List<Map<String, String>> data = this.service.findAll();
        return Map.of("msg", "getMemoData", "data", data);
    }
}
