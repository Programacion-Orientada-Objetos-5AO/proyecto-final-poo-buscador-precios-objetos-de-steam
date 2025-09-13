package com.seeker.demo.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String mensaje) {
        super(mensaje);
    }
}
