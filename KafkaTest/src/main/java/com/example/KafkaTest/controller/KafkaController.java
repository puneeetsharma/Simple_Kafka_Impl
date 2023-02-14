package com.example.KafkaTest.controller;


import com.example.KafkaTest.Service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    Producer producer;

    @GetMapping("/producerMsg")
    public void getMessage(@RequestParam(value = "message") String message)
    {
        producer.sendMsgToTopic(message);
    }
}
