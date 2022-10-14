package com.zerotohero.emailservice.kafka;

import com.zerotohero.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(OrderEvent event) {
        LOGGER.info(String.format("Order event received inemail service =>%s", event.toString()));

        // now we can send email to the customer


    }
}