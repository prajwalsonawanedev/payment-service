package com.paymentservice.service;

import com.paymentservice.dto.InventoryPaymentDto;
import com.paymentservice.request.PaymentRequestDto;
import com.paymentservice.response.ApiResponse;

public interface PaymentService {

    void createPayment(PaymentRequestDto paymentRequestDto);
}
