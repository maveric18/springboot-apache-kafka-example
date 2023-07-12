package com.example.Spring.Boot.kafka.consumer;

import com.example.Spring.Boot.kafka.constants.AppConstants;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(String message){
        LOGGER.info(String.format("Message Received -->" + message));
    }

}
