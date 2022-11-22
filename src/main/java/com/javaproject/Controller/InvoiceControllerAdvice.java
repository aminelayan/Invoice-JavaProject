package com.javaproject.Controller;


import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InvoiceControllerAdvice extends ResponseEntityExceptionHandler {


    @ExceptionHandler({ AuthenticationException.class })
    @ResponseBody
    public String handleAuthenticationException(Exception ex) {
        return "fuckoff";
    }


}

