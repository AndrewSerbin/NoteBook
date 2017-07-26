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

    public class Builder {

        public Builder setName(FullName fullName) {
            Record.this.fullName = fullName;
            return this;
        }

        public Builder setNick(String nick) {
            Record.this.nick = nick;
            return this;
        }

        public Builder setDescription(String description) {
            Record.this.description = description;
            return this;
        }

        public Builder setGroup(Group group) {
            Record.this.group = group;
            return this;
        }

        public Builder setTelephone(Telephone telephone) {
            Record.this.telephone = telephone;
            return this;
        }

        public Builder setSkype(String skype) {
            Record.this.skype = skype;
            return this;
        }

        public Builder setEmail(String email) {
            Record.this.email = email;
            return this;
        }

        public Builder setAddress(Address address) {
            Record.this.address = address;
            return this;
        }

        public Record build() {
            return Record.this;
        }

    }
}
