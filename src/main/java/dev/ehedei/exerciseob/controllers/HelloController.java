package dev.ehedei.exerciseob.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @Value("${app.message.start}")
    private String message;

    @Value("${app.user}")
    private String user;

    @GetMapping("/message")
    public String getGrettings() {
        System.out.println(user);
        //System.getenv().forEach((key, value) -> System.out.println(key + ": " + value));
        return message;
    }
}
