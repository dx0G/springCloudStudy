package com.guodx.springCloud.dao;

import com.guodx.springCloud.entities.Payment;


public interface PaymentMapper {
    int insertPayment(Payment payment);

    Payment getPaymentById(long id);
}
