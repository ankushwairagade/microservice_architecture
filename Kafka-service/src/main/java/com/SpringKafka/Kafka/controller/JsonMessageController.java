package com.SpringKafka.Kafka.controller;


import com.SpringKafka.Kafka.kafka.JsonKafkaProducer;
import com.SpringKafka.Kafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }


    @GetMapping("/")
    public String running()
    {
        return "Kafka running ...";
    }

    @PostMapping("/sendemail")
    public ResponseEntity<String > publish (@RequestBody User user)
    {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }




}
