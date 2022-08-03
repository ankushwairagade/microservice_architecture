package com.SpringKafka.Kafka.kafka;

import com.SpringKafka.Kafka.email.EmailSenderService;
import com.SpringKafka.Kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class JsonKafkaConsumer {

    @Autowired
    EmailSenderService emailSenderService;
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics="javaguides_json" , groupId = "myGroup")
    public void consume(User user)
    {
        LOGGER.info(String.format("Json message recieved -->  %s",user.toString()));


        boolean f = emailSenderService.sendEmail(user.getTo(),user.getCc(),user.getBcc(),user.getSubject(),user.getBody());

        if(f)
        {
            LOGGER.info(String.format("Mail send Successfully"));
        }else{
        LOGGER.info(String.format("Mail not send... something went wrong"));
    }
    }

}
