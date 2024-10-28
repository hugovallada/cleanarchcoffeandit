package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.controller;

import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto.PaymentDto;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.contracts.PaymentApplication;
import com.github.hugovallada.cleanarchcoffe.cleanarchcourse.controller.contracts.PaymentController;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@Log4j2
public class PaymentControllerImpl implements PaymentController<ResponseEntity<PaymentDto>> {

    private final PaymentApplication paymentApplication;

    @Override
    @PostMapping("/payments")
    public ResponseEntity<PaymentDto> sendPayment(@RequestBody PaymentDto paymentDto) {
        log.info(paymentDto);
        return ResponseEntity.ok(paymentApplication.receivePayment(paymentDto));
    }

    @Override
    @DeleteMapping("/payment/{id}")
    public ResponseEntity<PaymentDto> deletePayment(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePayment'");
    }

    @Override
    @PatchMapping("/payment/{id}")
    public ResponseEntity<PaymentDto> approvePayment(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'approvePayment'");
    }

    @Override
    @GetMapping("/payment/{id}")
    public ResponseEntity<PaymentDto> findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }


}
