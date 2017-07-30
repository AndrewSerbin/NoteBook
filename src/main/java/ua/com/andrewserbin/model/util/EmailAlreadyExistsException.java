package ua.com.andrewserbin.model.util;

import ua.com.andrewserbin.model.entity.Record;

/**
 * Created by layer on 30.07.2017.
 */
public class EmailAlreadyExistsException extends Exception {

    private Record record;

    public EmailAlreadyExistsException(Record record) {
        this.record = record;
    }

    public EmailAlreadyExistsException(String message, Record record) {
        super(message);
        this.record = record;
    }

    public Record getRecord() {
        return record;
    }
}
