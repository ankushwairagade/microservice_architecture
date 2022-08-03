package com.SpringKafka.Kafka.controller;

import com.SpringKafka.Kafka.kafka.KafkaProducer;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }


    // http:localhost:8080/api/v1/kafka/publish?message=hello world
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String msg)
    {
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("message sent to topic");
    }

    @GetMapping("/live")
    public String check()
    {
        return "Live...";
    }
}
