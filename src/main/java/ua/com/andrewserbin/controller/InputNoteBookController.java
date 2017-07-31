package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.model.entity.*;
import ua.com.andrewserbin.view.ViewConstants;
import java.util.Date;
import java.util.Scanner;

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

    private Date dateOfLastChanging;

    private ScannerRegexController scannerRegexController;

    private Scanner sc;

    public InputNoteBookController(ScannerRegexController scannerRegexController) {
        this.scannerRegexController = scannerRegexController;
        sc = new Scanner(System.in);
    }

    /**
     * Gets data from user. Creates record with inputted data.
     * @return record
     */
    public Record inputRecord() {
        group = inputGroup();
        fullName = inputFullName();
        nick = inputNick();
        description = inputDescription();
        telephone = inputTelephone();
        email = inputEmail();
        skype = inputSkype();
        address = inputAddress();
        dateOfLastChanging = refreshDateOfLastChanging();

        return buildRecord();
    }

    Record buildRecord() {
        return new Record().getBuilder()
                    .setGroup(group)
                    .setFullName(fullName)
                    .setNick(nick)
                    .setDescription(description)
                    .setTelephone(telephone)
                    .setEmail(email)
                    .setSkype(skype)
                    .setAddress(address)
                    .setDateOfLastChanging(dateOfLastChanging)
                    .build();
    }

    Group inputGroup() {
        return Group.valueOf(scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_GROUP, RegexConstants.REGEX_GROUP).toUpperCase());
    }

    FullName inputFullName() {
        String surname = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SURNAME, RegexConstants.REGEX_NAME);
        String name = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_NAME, RegexConstants.REGEX_NAME);
        String patronymic = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_PATRONYMIC, RegexConstants.REGEX_NAME);

        String truncatedName = truncateName(surname, name);

        return new FullName(surname, name, patronymic, truncatedName);
    }

    String truncateName(String surname, String name) {
        String space = new String(" ");
        String point = new String(".");

        return new StringBuilder()
                .append(surname)
                .append(space)
                .append(name.charAt(0))
                .append(point)
                .toString();
    }

    String inputNick() {
        return scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_NICK, RegexConstants.REGEX_NICK);
    }

    String inputDescription() {
        return scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_DESCRIPTION, RegexConstants.REGEX_DESCRIPTION);
    }

    Telephone inputTelephone() {
        String mainTelephone = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_MAIN_TELEPHONE, RegexConstants.REGEX_TELEPHONE);
        String spareTelephone = scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SPARE_TELEPHONE, RegexConstants.REGEX_TELEPHONE);

        return new Telephone(mainTelephone, spareTelephone);
    }

    String inputEmail() {
        return scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_EMAIL, RegexConstants.REGEX_EMAIL);
    }

    String inputSkype() {
        return scannerRegexController.inputStringInAccordanceWithRegex(sc,
                ViewConstants.INPUT_SKYPE, RegexConstants.REGEX_SKYPE);
    }

    Address inputAddress() {
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

        return new Address(index, city, street, houseNumber, apartmentNumber, fullAddress);
    }

    String createFullAddress(String index, String city, String street,
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

    Date refreshDateOfLastChanging() {
        return new Date();
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

    public Date getDateOfLastChanging() {
        return dateOfLastChanging;
    }

    public ScannerRegexController getScannerRegexController() {
        return scannerRegexController;
    }

    public Scanner getSc() {
        return sc;
    }
}
