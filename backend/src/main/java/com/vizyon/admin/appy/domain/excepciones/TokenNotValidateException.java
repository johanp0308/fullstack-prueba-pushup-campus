package com.vizyon.admin.appy.domain.excepciones;

public class TokenNotValidateException extends RuntimeException {
    public TokenNotValidateException(String message){
        super(message);
    }
}
