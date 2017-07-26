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
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_NAME);

        String surname = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SURNAME, pattern);
        String name = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_NAME, pattern);
        String patronymic = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_PATRONYMIC, pattern);

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
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_NICK);

        nick = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_NICK, pattern);
    }

    private void inputDescription() {
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_DESCRIPTION);

        description = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_DESCRIPTION, pattern);
    }

    private void inputTelephone() {
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_TELEPHONE);

        String mainTelephone = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_MAIN_TELEPHONE, pattern);
        String spareTelephone = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SPARE_TELEPHONE, pattern);

        telephone = new Telephone(mainTelephone, spareTelephone);
    }

    private void inputEmail() {
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_EMAIL);

        email = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_EMAIL, pattern);
    }

    private void inputSkype() {
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_SKYPE);

        nick = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SKYPE, pattern);
    }

    private void inputAddress() {
        Pattern pattern = Pattern.compile(RegexConstants.REGEX_INDEX);

        String index = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_INDEX, pattern);

        pattern = Pattern.compile(RegexConstants.REGEX_CITY_AND_STREET);

        String city = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_CITY, pattern);
        String street = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_STREET, pattern);

        pattern = Pattern.compile(RegexConstants.REGEX_HOUSE_AND_APARTMENT_NUMBER);

        String houseNumber = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_HOUSE_NUMBER, pattern);
        String apartmentNumber = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_APARTMENT_NUMBER, pattern);

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
                .append(", house: ")
                .append(houseNumber)
                .append(", apartment: ")
                .append(apartmentNumber)
                .toString();
    }
}
