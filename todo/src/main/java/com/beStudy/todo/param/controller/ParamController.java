package com.beStudy.todo.param.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/param")
public class ParamController {
    @RequestMapping(method= RequestMethod.GET)
    public List<Map<String, String>> index () {
        return List.of(Map.of("hi","123"));
    }
}
