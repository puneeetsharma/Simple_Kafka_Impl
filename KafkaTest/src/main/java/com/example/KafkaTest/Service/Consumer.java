package com.example.KafkaTest.Service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "newTopic",groupId = "newGroup")
    public void listen(String receivedMessage)
    {
        System.out.println(receivedMessage);
    }
}
