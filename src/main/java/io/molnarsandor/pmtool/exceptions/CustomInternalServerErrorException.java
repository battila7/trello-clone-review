package io.molnarsandor.pmtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CustomInternalServerErrorException extends RuntimeException {

    public CustomInternalServerErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
