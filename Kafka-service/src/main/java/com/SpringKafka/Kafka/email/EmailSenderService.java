package com.SpringKafka.Kafka.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

       public boolean sendEmail(String toEmail , String cc , String bcc, String subject , String body)
       {
           SimpleMailMessage message = new SimpleMailMessage();
           message.setFrom("xy@com");
           message.setTo(toEmail);
           message.setText(body);
           message.setSubject(subject);
          // message.setCc(cc);
          // message.setBcc(bcc);

           mailSender.send(message);

           System.out.println("Mail send successfully ...");
         return true;
       }

    }
