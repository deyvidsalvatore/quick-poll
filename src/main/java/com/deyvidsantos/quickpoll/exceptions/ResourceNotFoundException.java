package com.deyvidsantos.quickpoll.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Exceção lançada quando um recurso não é encontrado.
     */
    public ResourceNotFoundException() {
    }

    /**
     * Exceção lançada quando um recurso não é encontrado, com uma mensagem de erro
     * personalizada.
     *
     * @param message a mensagem de erro personalizada
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * Exceção lançada quando um recurso não é encontrado, com uma mensagem de erro
     * personalizada e uma causa raiz.
     *
     * @param message a mensagem de erro personalizada
     * @param cause   a causa raiz da exceção
     */
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
