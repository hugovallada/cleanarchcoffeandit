package com.github.hugovallada.cleanarchcoffe.cleanarchcourse.adapter.dto;

public record OrderDto(
    String customerFirstName,
    String customerLastName,
    String billingStreet,
    String billingCity,
    String zipCode
) {

}
