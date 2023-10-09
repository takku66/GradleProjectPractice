package com.example.demo1.controller;

import com.example.demo1.model.DemoModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/hello")
@AllArgsConstructor
public class DemoController {

    private final ObjectMapper mapper;

    @GetMapping
    @ResponseBody
    public String hello(){
        final DemoModel demoModel = new DemoModel();
        demoModel.setId("id-123");
        demoModel.setName("id-123");
        return "{\"message\": \"hello world!\"}";
    }
}
