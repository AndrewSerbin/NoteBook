package ua.com.andrewserbin.model.entity;

import org.junit.Before;
import org.junit.Test;
import ua.com.andrewserbin.model.util.EmailAlreadyExistsException;

/**
 * Created by layer on 30.07.2017.
 */
public class NoteBookTest {

    private NoteBook noteBook;

    private Record record;

    @Before
    public void initNoteBook() {
        noteBook = new NoteBook();

        record = new Record().getBuilder()
                .setGroup(RecordExample.RECORD_ONE.getGroup())
                .setName(RecordExample.RECORD_ONE.getFullName())
                .setNick(RecordExample.RECORD_ONE.getNick())
                .setDescription(RecordExample.RECORD_ONE.getDescription())
                .setTelephone(RecordExample.RECORD_ONE.getTelephone())
                .setEmail(RecordExample.RECORD_ONE.getEmail())
                .setSkype(RecordExample.RECORD_ONE.getSkype())
                .setAddress(RecordExample.RECORD_ONE.getAddress())
                .build();
    }

    @Test (expected = EmailAlreadyExistsException.class)
    public void checkEmailForUniqIfEmailExistsTest() throws Exception {
        noteBook.add(record);
        noteBook.add(record);
    }
}