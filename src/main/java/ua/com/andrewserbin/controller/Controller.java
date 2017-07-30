package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.model.Model;
import ua.com.andrewserbin.model.entity.Record;
import ua.com.andrewserbin.model.util.EmailAlreadyExistsException;
import ua.com.andrewserbin.view.View;

/**
 * Created by layer on 26.07.2017.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        ScannerRegexController scannerRegexController = new ScannerRegexController(view);
        InputNoteBookController inputNoteBookController = new InputNoteBookController(scannerRegexController);

        Record record = inputNoteBookController.inputRecord();

        addRecord(inputNoteBookController, record);
    }

    void addRecord(InputNoteBookController inputNoteBookController, Record record) {
        boolean transactionIncompleted = true;
        do {
            try {
                model.addRecord(record);

                transactionIncompleted = false;
            } catch (EmailAlreadyExistsException ex) {
                record = ex.getRecord();
                inputNoteBookController.inputEmail();
                record.setEmail(inputNoteBookController.getEmail());
                record.setDateOfLastChanging(inputNoteBookController.getDateOfLastChanging());
            }
        } while (transactionIncompleted);
    }
}
