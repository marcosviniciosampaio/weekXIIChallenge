package marcos.filho.mscars.exception;

import org.apache.hc.core5.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private  String message;
    private  HttpStatus httpStatus;
    private  ZonedDateTime zonedDateTime;

    public ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }

    public ApiException(String message, ApiRequestException e, org.springframework.http.HttpStatus badRequest, ZonedDateTime z) {
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
