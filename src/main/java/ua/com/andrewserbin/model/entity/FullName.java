package ua.com.andrewserbin.model.entity;

/**
 * Created by layer on 26.07.2017.
 */
public class FullName {

    private String surname;

    private String name;

    private String patronymic;

    private String truncatedName;

    public FullName(String surname, String name, String patronymic, String truncatedName) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.truncatedName = truncatedName;
    }
}
