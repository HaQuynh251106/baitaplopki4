package com.example.t2410e.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum StatusCode {
    SUCCESS("0000", "Tốt em", HttpStatus.OK),
    BAD_REQUEST("1000","YEU CAU DEO HOP LE", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED("002","DECH CO QUYEN", HttpStatus.UNAUTHORIZED),
    FORBIDDEN("003","BI TU CHOI", HttpStatus.FORBIDDEN),
    NOT_FOUND("004","DEO THAY DU LIEU", HttpStatus.NOT_FOUND),
    VALIDATION_ERROR("005", "TRUYEN DU LIEU SAI ROI", HttpStatus.BAD_REQUEST),
    SERVICE_UNAVAILABLE("006","DICH VU KHONG KHA DUNG", HttpStatus.SERVICE_UNAVAILABLE);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;

}
