package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.contracts;

import java.util.Optional;
import java.util.UUID;

import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.PaymentDto;

public interface PaymentApplication {
    PaymentDto receivePayment(final PaymentDto paymentDto);
    void cancelPayment(final UUID id);
    PaymentDto approvePayment(final UUID id);
    Optional<PaymentDto> findById(final UUID id);
}
