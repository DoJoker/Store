package com.yisus.ejemplo.exception;

import org.springframework.http.HttpStatus;

public class DataNotFoundException extends BaseException {
    private static final long serialVersionUID = 1L;

    public DataNotFoundException(ErrorType type, HttpStatus code, String details, String location, String moreInfo) {
        super(type, code, details, location, moreInfo);
    }

    public DataNotFoundException(ErrorType type, HttpStatus code, String details, String location, String moreInfo,
                                 Throwable cause) {
        super(type, code, details, location, moreInfo, cause);
    }

    public DataNotFoundException(ErrorType type, HttpStatus code, String details, String location, Throwable cause) {
        super(type, code, details, location, cause);
    }
}
