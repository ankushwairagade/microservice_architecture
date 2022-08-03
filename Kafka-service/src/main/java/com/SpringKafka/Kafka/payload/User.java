package com.SpringKafka.Kafka.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private String to;
    private String from;
    private String subject;
    private String cc;
    private String bcc;

    private String body;
    private String attachmentURI;


    @Override
    public String toString() {
        return "User{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", cc='" + cc + '\'' +
                ", bcc='" + bcc + '\'' +
                ", body='" + body + '\'' +
                ", attachmentURI='" + attachmentURI + '\'' +
                '}';
    }
}
