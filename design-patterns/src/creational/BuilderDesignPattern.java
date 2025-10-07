package creational;

import java.time.LocalDateTime;

class ErrorResponse {
    private int statusCode;
    private String reason;
    private String message;
    private LocalDateTime timestamp;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

class ErrorResponseBuilder {

    private ErrorResponse errorResponse;

    public ErrorResponseBuilder buildErrorResponse() {
        return this;
    }

    public ErrorResponse build() {
        return errorResponse;
    }

    public ErrorResponseBuilder withStatusCode(int code) {
        errorResponse.setStatusCode(code);
        return this;
    }

    public ErrorResponseBuilder withReason(String reason) {
        errorResponse.setReason(reason);
        return this;
    }

    public ErrorResponseBuilder withMessage(String message) {
        errorResponse.setMessage(message);
        return this;
    }

    public ErrorResponseBuilder withTimeStamp(LocalDateTime timeStamp) {
        errorResponse.setTimestamp(timeStamp);
        return this;
    }

}

public class BuilderDesignPattern {


    public static void main(String[] args) {

        ErrorResponseBuilder errorResponseBuilder = new ErrorResponseBuilder();

        ErrorResponse errorResponse = errorResponseBuilder.buildErrorResponse()
                .withStatusCode(404)
                .withReason("Not Found")
                .build();


    }

}
