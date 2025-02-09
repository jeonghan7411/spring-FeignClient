package dev.be.feign.controller;

import dev.be.feign.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService service;

    @GetMapping("/get")
    public String getController(){
        return service.get();
    }

    @GetMapping("/post")
    public String postController(){
        return service.post();
    }
}
