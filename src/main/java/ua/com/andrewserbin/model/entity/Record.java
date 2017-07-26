package ua.com.andrewserbin.model.entity;

import java.util.Date;

/**
 * Created by layer on 26.07.2017.
 */
public class Record {

    private FullName fullName;

    private String nick;

    private String description;

    private Group group;

    private Telephone telephone;

    private String email;

    private String skype;

    private Address address;

    private Date dateOfEntryInNoteBook;

    private Date dateOfLastChanging;

    public static Builder getBuilder() {
        return new Record().new Builder();
    }

    class Builder {

        public Builder setName(String name, String surname, String patronymic, String truncatedName) {
            Record.this.fullName = new FullName(name, surname, patronymic, truncatedName);
            return this;
        }

        // TODO Another builder setters

        public Record build() {
            return Record.this;
        }

    }
}
