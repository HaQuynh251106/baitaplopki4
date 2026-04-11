package com.example.t2410e.dto.common;

import com.example.t2410e.enums.StatusCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.tools.Diagnostic;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO <T>{
    private String code;
    private String message;
    private T data;

    public <StatusCode> ResponseDTO(StatusCode  StatusCode , T data ){
        Diagnostic<Object> statusCode = null;
        this.code = statusCode.getCode();
        Throwable httpStatus = null;
        this.message = httpStatus.getMessage();
        this.data = data;
    }



}