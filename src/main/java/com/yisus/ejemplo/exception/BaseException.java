package com.yisus.ejemplo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * This class represents the base exception to any error that will be happen during program execution.
 * All errors checked or unchecked should be managed and converter to a controlled error.
 */
@Getter
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final ErrorType type;
    private final HttpStatus code;
    private final String location;
    private final String details;
    private final String moreInfo;

    public BaseException(ErrorType type, HttpStatus code, String location, String details, String moreInfo) {
        super(details);
        this.type = type;
        this.code = code;
        this.location = location;
        this.details = details;
        this.moreInfo = moreInfo;
    }

    public BaseException(ErrorType type, HttpStatus code, String location, String details) {
        super(details);
        this.type = type;
        this.code = code;
        this.location = location;
        this.details = details;
        this.moreInfo = null;
    }

    public BaseException(ErrorType type, HttpStatus code, String location, String details, String moreInfo,
                         Throwable cause) {
        super(cause.getMessage() + ";" + details, cause);
        this.type = type;
        this.code = code;
        this.location = location;
        this.details = details;
        this.moreInfo = moreInfo;
    }

    public BaseException(ErrorType type, HttpStatus code, String location, String details, Throwable cause) {
        super(cause.getMessage() + ";" + details, cause);
        this.type = type;
        this.code = code;
        this.location = location;
        this.details = details;
        this.moreInfo = null;
    }

}
