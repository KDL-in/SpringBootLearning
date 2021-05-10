package com.springboot.springboot03admin.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String handleArithException(Exception exception) {
        log.error("异常是： {}", exception);
        return "login";
    }
}
