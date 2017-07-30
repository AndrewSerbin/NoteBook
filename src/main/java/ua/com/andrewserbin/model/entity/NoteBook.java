package ua.com.andrewserbin.model.entity;

import ua.com.andrewserbin.model.util.EmailAlreadyExistsException;
import java.util.ArrayList;

/**
 * Created by layer on 26.07.2017.
 */
public class NoteBook {

    private ArrayList<Record> records;

    public NoteBook() {
        records = new ArrayList<>();
    }

    public void add(Record inputedRecord) throws EmailAlreadyExistsException {
        checkEmailForUniq(inputedRecord);

        inputedRecord.refreshDateOfEntryInNoteBook();
        records.add(inputedRecord);
    }

    void checkEmailForUniq(Record inputedRecord) throws EmailAlreadyExistsException {
        for (Record r :
                records) {
            if (r.getEmail().equalsIgnoreCase(inputedRecord.getEmail())) {
                throw new EmailAlreadyExistsException(inputedRecord);
            }
        }
    }
}
