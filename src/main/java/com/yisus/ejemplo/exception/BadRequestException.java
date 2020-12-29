package com.yisus.ejemplo.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException {
    private static final long serialVersionUID = 1L;

    public BadRequestException(ErrorType type, String details, String location, String moreInfo) {
        super(type, HttpStatus.BAD_REQUEST, details, location, moreInfo);
    }

    public BadRequestException(ErrorType type, String details, String location, String moreInfo,
                               Throwable cause) {
        super(type, HttpStatus.BAD_REQUEST, details, location, moreInfo, cause);
    }

    public BadRequestException(ErrorType type, String details, String location, Throwable cause) {
        super(type, HttpStatus.BAD_REQUEST, details, location, cause);
    }

    public BadRequestException(ErrorType type, String details, String location) {
        super(type, HttpStatus.BAD_REQUEST, details, location);
    }
}
