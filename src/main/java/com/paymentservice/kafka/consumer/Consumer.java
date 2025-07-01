package com.paymentservice.kafka.consumer;

import com.paymentservice.dto.InventoryPaymentDto;
import com.paymentservice.service.PaymentService;
import com.paymentservice.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    private final JsonUtil jsonUtil;

    private final PaymentService paymentService;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public Consumer(JsonUtil jsonUtil, PaymentService paymentService, KafkaTemplate kafkaTemplate) {
        this.jsonUtil = jsonUtil;
        this.paymentService = paymentService;
        this.kafkaTemplate = kafkaTemplate;
    }


    @KafkaListener(
            topics = "inventory-created",
            groupId = "payment-service-group",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void readMessageFromInventoryService(String message) {

    }
//    @KafkaListener(topics = "inventory-success", groupId = "payment-service-group")
//    public void testRaw(String message) {
//        System.out.println("🔥 RAW MESSAGE: " + message);
//    }
}
