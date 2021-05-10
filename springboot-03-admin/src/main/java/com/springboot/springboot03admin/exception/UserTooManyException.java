package com.springboot.springboot03admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "too many users")
public class UserTooManyException extends RuntimeException {
    public UserTooManyException() {

    }

    public UserTooManyException(String message) {
        super(message);
    }
}
