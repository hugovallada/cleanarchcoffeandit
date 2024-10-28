package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.controller.contracts;

import java.util.UUID;

import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.PaymentDto;

public interface PaymentController<E> {

    E sendPayment(final PaymentDto paymentDto);
    E deletePayment(final UUID id);
    E approvePayment(final UUID id);
    E findById(final UUID id);

}
