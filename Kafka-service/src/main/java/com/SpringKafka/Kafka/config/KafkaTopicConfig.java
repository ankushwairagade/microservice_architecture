package com.SpringKafka.Kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // For String
    @Bean
    public NewTopic javaguidesTopic()
    {
        return TopicBuilder
                .name("javaguides")
                .partitions(1)
                .build();
    }

    // for Json Data
    @Bean
    public NewTopic javaguidesJsonTopic()
    {
        return TopicBuilder
                .name("javaguides_json")
                .partitions(1)
                .build();
    }


}
