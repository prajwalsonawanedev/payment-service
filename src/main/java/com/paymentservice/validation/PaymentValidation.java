package com.paymentservice.validation;

import com.paymentservice.request.PaymentRequestDto;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaymentValidation {

    public static List<String> paymentValidation(PaymentRequestDto paymentRequestDto) {

        List<String> errorList = new ArrayList<>();

        if (ObjectUtils.isEmpty(paymentRequestDto)) {
            errorList.add("Please provide valid payment request");
            return errorList;
        }

        if (!StringUtils.hasText(paymentRequestDto.getPaymentMode())) {
            errorList.add("Payment mode is required");
        }

        if (!StringUtils.hasText(paymentRequestDto.getUserId())) {
            errorList.add("User ID is required");
        }

        if (paymentRequestDto.getInventoryId() == null || paymentRequestDto.getInventoryId() <= 0) {
            errorList.add("Please provice valid inventory id");
        }

        if (paymentRequestDto.getStockId() == null || paymentRequestDto.getStockId() <= 0) {
            errorList.add("Please provide Valid Stock ID");
        }

        if (paymentRequestDto.getTotalAmount() == null || paymentRequestDto.getTotalAmount() <= 0) {
            errorList.add("Total amount must be greater than 0");
        }

        return errorList;
    }

}
