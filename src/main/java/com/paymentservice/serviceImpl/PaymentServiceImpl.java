package com.paymentservice.serviceImpl;

import com.paymentservice.repository.PaymentRepository;
import com.paymentservice.request.PaymentRequestDto;
import com.paymentservice.response.ApiResponse;
import com.paymentservice.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    @Override
    public PaymentRequestDto createPayment(PaymentRequestDto paymentRequestDto) {
        return null;
    }

    @Override
    public ApiResponse updatePayment(PaymentRequestDto paymentRequestDto) {
        return null;
    }
}
