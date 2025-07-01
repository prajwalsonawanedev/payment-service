package com.paymentservice.controller;

import com.paymentservice.request.PaymentRequestDto;
import com.paymentservice.response.ApiResponse;
import com.paymentservice.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/createPayment")
    public ResponseEntity<ApiResponse> createPayment(@RequestBody PaymentRequestDto paymentRequestDto) {
        paymentService.createPayment(paymentRequestDto);
        return null;
    }
}
