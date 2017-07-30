package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.model.entity.*;
import ua.com.andrewserbin.view.ViewConstants;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by layer on 26.07.2017.
 */
public class InputNoteBookController {

    private FullName fullName;

    private String nick;

    private String description;

    private Group group;

    private Telephone telephone;

    private String email;

    private String skype;

    private Address address;

    private ScannerRegexController scannerRegexController;

    private Scanner sc;

    public InputNoteBookController(ScannerRegexController scannerRegexController) {
        this.scannerRegexController = scannerRegexController;
        sc = new Scanner(System.in);
    }

    public Record inputRecord() {
        inputFullName();
        inputNick();
        inputDescription();
        inputTelephone();
        inputEmail();
        inputSkype();
        inputAddress();

        //TODO Add date of last changing and entry in note book. Add group.

        Record record = new Record().getBuilder()
                .setName(fullName)
                .setNick(nick)
                .setDescription(description)
                .setTelephone(telephone)
                .setEmail(email)
                .setSkype(skype)
                .setAddress(address)
                .build();

        return record;
    }

    private void inputFullName() {
        String surname = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SURNAME, RegexConstants.REGEX_NAME);
        String name = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_NAME, RegexConstants.REGEX_NAME);
        String patronymic = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_PATRONYMIC, RegexConstants.REGEX_NAME);

        String truncatedName = truncateName(surname, name);

        fullName = new FullName(surname, name, patronymic, truncatedName);
    }

    private String truncateName(String surname, String name) {
        String space = new String(" ");
        String point = new String(".");

        return new StringBuilder()
                .append(surname)
                .append(space)
                .append(name.charAt(0))
                .append(point)
                .toString();
    }

    private void inputNick() {
        nick = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_NICK, RegexConstants.REGEX_NICK);
    }

    private void inputDescription() {
        description = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_DESCRIPTION, RegexConstants.REGEX_DESCRIPTION);
    }

    private void inputTelephone() {
        String mainTelephone = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_MAIN_TELEPHONE, RegexConstants.REGEX_TELEPHONE);
        String spareTelephone = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SPARE_TELEPHONE, RegexConstants.REGEX_TELEPHONE);

        telephone = new Telephone(mainTelephone, spareTelephone);
    }

    private void inputEmail() {
        email = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_EMAIL, RegexConstants.REGEX_EMAIL);
    }

    private void inputSkype() {
        nick = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SKYPE, RegexConstants.REGEX_SKYPE);
    }

    private void inputAddress() {
        String index = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_INDEX, RegexConstants.REGEX_INDEX);

        String city = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_CITY, RegexConstants.REGEX_CITY_AND_STREET);
        String street = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_STREET, RegexConstants.REGEX_CITY_AND_STREET);

        String houseNumber = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_HOUSE_NUMBER, RegexConstants.REGEX_HOUSE_AND_APARTMENT_NUMBER);
        String apartmentNumber = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_APARTMENT_NUMBER, RegexConstants.REGEX_HOUSE_AND_APARTMENT_NUMBER);

        String fullAddress = createFullAddress(index, city, street, houseNumber, apartmentNumber);

        address = new Address(index, city, street, houseNumber, apartmentNumber, fullAddress);
    }

    private String createFullAddress(String index, String city, String street,
                                     String houseNumber, String apartmentNumber) {
        String comma = new String(", ");

        return new StringBuilder()
                .append(index)
                .append(comma)
                .append(city)
                .append(comma)
                .append(street)
                .append(comma)
                .append("house: ")
                .append(houseNumber)
                .append(comma)
                .append("apartment: ")
                .append(apartmentNumber)
                .toString();
    }
}
