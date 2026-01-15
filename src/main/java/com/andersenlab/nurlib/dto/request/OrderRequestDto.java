package com.andersenlab.nurlib.dto.request;

import lombok.Data;

@Data
public class OrderRequestDto {

    private String reader;

    private Long bookId;
}
