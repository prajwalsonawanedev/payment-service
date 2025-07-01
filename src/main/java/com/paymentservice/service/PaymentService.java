package com.paymentservice.service;

import com.paymentservice.request.PaymentRequestDto;
import com.paymentservice.response.ApiResponse;

public interface PaymentService {

    PaymentRequestDto createPayment(PaymentRequestDto paymentRequestDto);

    ApiResponse updatePayment(PaymentRequestDto paymentRequestDto);
}
