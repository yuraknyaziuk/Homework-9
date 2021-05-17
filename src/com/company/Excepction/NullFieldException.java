package com.company.Excepction;

import com.company.Address;

public class NullFieldException extends RuntimeException {
    public NullFieldException(String massage) {
        super (massage);
    }
}
