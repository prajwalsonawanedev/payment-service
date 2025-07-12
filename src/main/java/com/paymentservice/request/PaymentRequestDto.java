package com.paymentservice.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PaymentRequestDto {

    private String paymentMode;

    private String userId;

    private Long inventoryId;

    private Long stockId;

    private Double totalAmount;
}
