package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TemplateController {

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map){
        map.put("hello", "from TemplateController.helloHtml");
        return "/helloHtml";
    }

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String, Object> map){
        map.put("helloFtl", "from TemplateController.helloFtl");
        return "/helloFtl";
    }
}
