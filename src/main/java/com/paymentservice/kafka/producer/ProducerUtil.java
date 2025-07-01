package com.paymentservice.kafka.producer;

import com.paymentservice.dto.InventoryPaymentDto;
import com.paymentservice.dto.PaymentEvent;
import com.paymentservice.entity.Payment;
import com.paymentservice.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerUtil {

    private final JsonUtil jsonUtil;

    public String createPaymentEvent(Payment payment, InventoryPaymentDto inventoryPaymentDto) {
        PaymentEvent paymentEvent = PaymentEvent
                .builder()
                .paymentReferenceId(payment.getPaymentReferenceId())
                .status(payment.getPaymentStatus())
                .paymenMode(payment.getPaymentMode())
                .ammount(payment.getPrice())
                .inventoryPaymentDto(inventoryPaymentDto)
                .build();

        return jsonUtil.toJson(paymentEvent);

    }

    public String createPaymentFailedDto(InventoryPaymentDto inventoryPaymentDto) {
        PaymentEvent paymentEvent = PaymentEvent
                .builder()
                .paymentReferenceId(inventoryPaymentDto.getPaymentReferenceId())
                .status(inventoryPaymentDto.getStatus())
                .paymenMode(inventoryPaymentDto.getPaymentMode())
                .ammount(inventoryPaymentDto.getPrice())
                .inventoryPaymentDto(inventoryPaymentDto)
                .build();

        return jsonUtil.toJson(paymentEvent);

    }
}
