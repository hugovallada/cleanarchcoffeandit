package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.domain.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@ResponseStatus(UNPROCESSABLE_ENTITY)
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }
}
