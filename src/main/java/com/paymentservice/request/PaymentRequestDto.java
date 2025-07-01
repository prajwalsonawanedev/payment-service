package com.paymentservice.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {

    @JsonProperty("paymentMode")
    private String paymenMode;

    @JsonProperty("paymentStatus")
    private String status;

    @JsonProperty("paymentAmmount")
    private Double ammount;

    private Long paymentReferenceId;

    public String getPaymenMode() {
        return paymenMode;
    }

    public void setPaymenMode(String paymenMode) {
        this.paymenMode = paymenMode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmmount() {
        return ammount;
    }

    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }

    public Long getPaymentReferenceId() {
        return paymentReferenceId;
    }

    public void setPaymentReferenceId(Long paymentReferenceId) {
        this.paymentReferenceId = paymentReferenceId;
    }
}
