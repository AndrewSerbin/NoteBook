package ua.com.andrewserbin.model;

import ua.com.andrewserbin.model.entity.NoteBook;
import ua.com.andrewserbin.model.entity.Record;
import ua.com.andrewserbin.model.util.EmailAlreadyExistsException;

/**
 * Created by layer on 26.07.2017.
 */
public class Model {

    private NoteBook noteBook;

    public Model() {
        noteBook = new NoteBook();
    }

    public void addRecord(Record record) throws EmailAlreadyExistsException {
        noteBook.add(record);
    }
}
