package com.example.Kafka.PAC;

import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(kafkaConsumer.class);

   @KafkaListener(topics = "KafkaDemo",groupId = "myGroup")
    public void consume(String message)
    {
        logger.info(String.format("Message received -> %s",message));
    }
}
