package com.jaru.kafka.producer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProducerService {

    private static final Logger log = LogManager.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String main() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("TEST ["+localDateTime+"]");

        return "OK";
    }

    public String main2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        kafkaTemplate.send("mydata", "TEST2 ["+localDateTime+"]");

        return "OK2";
    }
}
