package ua.com.andrewserbin.model;

import ua.com.andrewserbin.model.entity.NoteBook;
import ua.com.andrewserbin.model.entity.Record;

/**
 * Created by layer on 26.07.2017.
 */
public class Model {

    private NoteBook noteBook;

    public Model() {
        noteBook = new NoteBook();
    }

    public void addRecord(Record record) {
        noteBook.add(record);
    }
}
