package com.deyvidsantos.quickpoll.dto.error;

public class ValidationError {

    private String code;
    private String message;

    public ValidationError() {
    }

    public ValidationError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
