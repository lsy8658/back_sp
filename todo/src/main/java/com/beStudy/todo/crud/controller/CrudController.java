package com.beStudy.todo.crud.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// 루트/api/crud
@RestController
@RequestMapping("/api/crud")
public class CrudController {

    @RequestMapping(method = RequestMethod.GET, value = "get")
    // @GetMapping
    public List<Map<String, String>> getIndex () {
        return List.of(Map.of("message","get index"));
    }
//    @PostMapping
    @RequestMapping(method = RequestMethod.POST , value = "post")
    public List<Map<String, String>> postIndex () {
        return List.of(Map.of("message","POST index"));
    }

//    @DeleteMapping
    @RequestMapping(method = RequestMethod.DELETE , value = "delete")
    public List<Map<String, String>> deleteIndex () {
        return List.of(Map.of("message","DELETE index"));
    }

//    @PutMapping
    @RequestMapping(method = RequestMethod.PUT , value = "put")
    public List<Map<String, String>> putIndex () {
        return List.of(Map.of("message","PUT index"));
    }

//    @PatchMapping
    @RequestMapping(method = RequestMethod.PATCH , value = "patch")
    public List<Map<String, String>> patchIndex () {
        return List.of(Map.of("message","PATCH index"));
    }
}
