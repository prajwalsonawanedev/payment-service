package com.paymentservice.kafka.consumer;

import com.paymentservice.dto.InventoryPaymentDto;
import com.paymentservice.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    private final JsonUtil jsonUtil;

    public Consumer(JsonUtil jsonUtil) {
        this.jsonUtil = jsonUtil;
    }


    @KafkaListener(
            topics = "inventory-success",
            groupId = "payment-service-group",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void readMessageFromInventoryService(String message) {
        try {
            System.out.println("inside");
            log.info("Message received: {}", message);
            InventoryPaymentDto inventoryPaymentDto = jsonUtil.fromJson(message, InventoryPaymentDto.class);
        } catch (Exception e) {
            System.out.println("Exception Occured:" + e.getMessage());
        }

    }
//    @KafkaListener(topics = "inventory-success", groupId = "payment-service-group")
//    public void testRaw(String message) {
//        System.out.println("🔥 RAW MESSAGE: " + message);
//    }
}
