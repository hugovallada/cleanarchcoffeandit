package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.domain;

import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.PaymentDto;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.Status;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.contracts.PaymentDomain;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.domain.exception.DomainException;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@Getter
@Log4j2
public class PaymentDomainImpl implements PaymentDomain {

    @Value("${payment.maxFutureDays:30}")
    private int maxFutureDays;

    @Value("${payment.minFutureDays:7}")
    private int minFutureDays;

    @Override
    public PaymentDto receivePayment(PaymentDto paymentDto) {
        if (Objects.nonNull(paymentDto.paymentDate()) && paymentDto.paymentDate().isAfter(LocalDateTime.now().plusDays(maxFutureDays))) {
            throw new DomainException("Pagamento recebido não pode ultrapassar: " + maxFutureDays + " dias");
        } else if (Objects.nonNull(paymentDto.paymentDate()) && paymentDto.paymentDate().isBefore(LocalDateTime.now().minusDays(minFutureDays))) {
            throw new DomainException("Não deve ser menor a 7 dias");
        }
        return updateStatus(paymentDto, Status.NOT_ALLOWED);
    }

    @Override
    public void cancelPayment(PaymentDto paymentDto) {


    }

    @Override
    public PaymentDto approvePayment(PaymentDto paymentDto) {
        return null;
    }

    private PaymentDto updateStatus(PaymentDto paymentDto, Status newStatus) {
        return new PaymentDto(
                paymentDto.id(),
                paymentDto.orderDto(),
                paymentDto.amount(),
                paymentDto.currency(),
                paymentDto.paymentDate(),
                paymentDto.paymentMethod(),
                newStatus
        );
    }
}
