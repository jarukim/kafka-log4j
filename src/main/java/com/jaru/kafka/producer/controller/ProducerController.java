package com.jaru.kafka.producer.controller;

import com.jaru.kafka.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private ProducerService service;

    @GetMapping(value = "/main")
    public String main() throws Exception {
        return service.main();
    }

    @GetMapping(value = "/main2")
    public String main2() throws Exception {
        return service.main2();
    }
}
