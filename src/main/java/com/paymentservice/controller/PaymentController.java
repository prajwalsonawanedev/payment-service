package com.paymentservice.controller;

import com.paymentservice.dto.InventoryPaymentDto;
import com.paymentservice.request.PaymentRequestDto;
import com.paymentservice.response.ApiResponse;
import com.paymentservice.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping("/demo")
//    public void demo() {
//
//        InventoryPaymentDto inventoryPaymentDto = InventoryPaymentDto
//                .builder()
//                .paymentMode("online")
//                .isInventorySuccess(true)
//                .paymentStatus("payment initiated")
//                .productName("test-demo")
//                .price(100.00)
//                .quantity(10)
//                .build();
//
//        paymentService.createPayment(inventoryPaymentDto);
//    }
}
