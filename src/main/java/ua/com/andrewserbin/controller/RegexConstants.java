package ua.com.andrewserbin.controller;

/**
 * Created by layer on 26.07.2017.
 */
public interface RegexConstants {

    String REGEX_NAME = "[A-Za-z]{2,30}";

    String REGEX_NICK = "[A-Za-z0-9]{1,30}";

    String REGEX_DESCRIPTION = "[A-Za-z0-9~!@#$%^&*()-_=+/|.]{1,30}";

    String REGEX_TELEPHONE = "\\d{10}";

    String REGEX_EMAIL = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";

    String REGEX_SKYPE = "[a-zA-Z][a-zA-z0-9]\\.,\\-_]{5,30}";
    
    String REGEX_INDEX = "[0-9]{5}";

    String REGEX_CITY_AND_STREET = "[a-zA-Z]*";

    String REGEX_HOUSE_AND_APARTMENT_NUMBER = "[0-9]{1,3}";
}
