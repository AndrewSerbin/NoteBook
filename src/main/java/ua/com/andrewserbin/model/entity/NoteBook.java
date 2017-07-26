package ua.com.andrewserbin.model.entity;

import java.util.ArrayList;

/**
 * Created by layer on 26.07.2017.
 */
public class NoteBook {

    private ArrayList<Record> records;

    public NoteBook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }
}
