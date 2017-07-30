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

    public FullName getFullName() {
        return fullName;
    }

    public String getNick() {
        return nick;
    }

    public String getDescription() {
        return description;
    }

    public Group getGroup() {
        return group;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDateOfEntryInNoteBook() {
        return dateOfEntryInNoteBook;
    }

    public Date getDateOfLastChanging() {
        return dateOfLastChanging;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDateOfEntryInNoteBook(Date dateOfEntryInNoteBook) {
        this.dateOfEntryInNoteBook = dateOfEntryInNoteBook;
    }

    public void setDateOfLastChanging(Date dateOfLastChanging) {
        this.dateOfLastChanging = dateOfLastChanging;
    }
}
