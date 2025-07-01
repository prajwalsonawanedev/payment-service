package com.paymentservice.serviceImpl;

import com.paymentservice.dateUtils.DailySequenceGenerator;
import com.paymentservice.dto.InventoryPaymentDto;
import com.paymentservice.entity.Payment;
import com.paymentservice.kafka.producer.PaymentProducer;
import com.paymentservice.kafka.producer.ProducerUtil;
import com.paymentservice.repository.PaymentRepository;
import com.paymentservice.request.PaymentRequestDto;
import com.paymentservice.response.ApiResponse;
import com.paymentservice.service.PaymentService;
import com.paymentservice.util.GenericMapper;
import com.paymentservice.validation.PaymentValidation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private List<String> errorList = new ArrayList<>();

    @Override
    public void createPayment(PaymentRequestDto paymentRequestDto) {

    }
}
