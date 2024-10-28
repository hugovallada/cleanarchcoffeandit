package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.contracts;

import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.PaymentDto;

public interface PaymentDomain {

    PaymentDto receivePayment(final PaymentDto paymentDto);
    void cancelPayment(final PaymentDto paymentDto);
    PaymentDto approvePayment(final PaymentDto paymentDto);

}
