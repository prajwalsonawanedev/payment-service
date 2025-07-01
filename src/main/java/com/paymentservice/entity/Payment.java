package com.paymentservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_tbl")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long paymentId;

    private String paymenMode;

    private String status;

    private Double ammount;

    private Long paymentReferenceId;
}
