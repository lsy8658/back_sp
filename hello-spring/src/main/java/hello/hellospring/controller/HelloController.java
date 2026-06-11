package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }
}

/*
    spring이 model이라는 것을 만들어서 넣어줍니다.

    기본적으로 resources에 templates에 이름이 같은 html을 찾아서 렌더링해줍니다.
*/