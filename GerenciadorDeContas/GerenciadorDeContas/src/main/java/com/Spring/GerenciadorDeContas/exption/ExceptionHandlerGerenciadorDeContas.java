package com.Spring.GerenciadorDeContas.exption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerGerenciadorDeContas extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> exceptionHandlerCampoInvalido(HttpMessageNotReadableException exception, HttpServletRequest request){
        return new ResponseEntity<>("Dados invalido, erro ! ",null, HttpStatus.BAD_REQUEST);
    }

}
