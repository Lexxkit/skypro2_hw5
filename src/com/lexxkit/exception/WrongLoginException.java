package com.lexxkit.exception;

import java.io.IOException;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String s) {
        super(s);
    }
}
