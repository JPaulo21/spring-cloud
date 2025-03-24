package io.github.springcloud.msavaliadorcredito.domain.exception;

import lombok.Getter;

public class ErrorComunicacaoMicroservicesException extends Exception {

    @Getter
    private Integer status;

    public ErrorComunicacaoMicroservicesException(String message, Integer status) {
        super(message);
        this.status = status;
    }
}
