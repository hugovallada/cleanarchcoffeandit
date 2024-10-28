package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.application;

import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.PaymentDto;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.contracts.PaymentApplication;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.contracts.PaymentDomain;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PaymentService implements PaymentApplication {

    private final PaymentDomain paymentDomain;

    @Override
    public PaymentDto receivePayment(PaymentDto paymentDto) {
        return paymentDomain.receivePayment(paymentDto);
    }

    @Override
    public void cancelPayment(UUID id) {

    }

    @Override
    public PaymentDto approvePayment(UUID id) {
        return null;
    }

    @Override
    public Optional<PaymentDto> findById(UUID id) {
        return Optional.empty();
    }
}
