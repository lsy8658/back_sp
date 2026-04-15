package com.beStudy.todo.param.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParamRequest {
    private String title;
    private String content;
}