package com.example.Spring.Boot.kafka.controller;

import com.example.Spring.Boot.kafka.producer.KafkaProducer;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaProducerController {
    @Autowired
    private KafkaProducer kafkaProducer;
    @GetMapping("/send-message")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka Topic");
    }
}
