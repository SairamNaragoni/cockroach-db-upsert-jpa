package com.rogue.cockroachdbupsert.exceptions;

public class RecordUpsertException extends RuntimeException {
    public RecordUpsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordUpsertException(String message) {
        super(message);
    }
}
