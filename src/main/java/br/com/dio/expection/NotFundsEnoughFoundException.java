package br.com.dio.expection;

public class NotFundsEnoughFoundException extends RuntimeException {
    public NotFundsEnoughFoundException(String message) {
        super(message);
    }
}
