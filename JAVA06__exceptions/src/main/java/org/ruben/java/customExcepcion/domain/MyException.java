package org.ruben.java.customExcepcion.domain;

public class MyException extends Exception {

    private final CodigoError code;

    public MyException(CodigoError code) {
        super();
        this.code = code;
    }

    public MyException(String message, Throwable cause, CodigoError code) {
        super(message, cause);
        this.code = code;
    }

    public MyException(String message, CodigoError code) {
        super(message);
        this.code = code;
    }

    public MyException(Throwable cause, CodigoError code) {
        super(cause);
        this.code = code;
    }

    public CodigoError getCode() {
        return this.code;
    }
}