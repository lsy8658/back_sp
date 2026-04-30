package com.study.sb.apiStudy;


import com.study.sb.apiStudy.dto.MemoDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiForm")
public class MemoFrom {
    @RequestMapping(
            method= RequestMethod.POST,
            value="/form",
            consumes=MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public List<Map<String, String>> formIndex (
            @ModelAttribute MemoDTO request
    ) {
            return List.of(Map.of());
    }
}
