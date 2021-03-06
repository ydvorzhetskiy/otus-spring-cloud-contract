package ru.otus.producer.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return "Hello, " + name + "!";
    }
}
