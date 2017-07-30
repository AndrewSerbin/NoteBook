package ua.com.andrewserbin.model.entity;

/**
 * Data for testing.
 * Created by layer on 30.07.2017.
 */
public enum RecordExample {
    RECORD_ONE(Group.ALL,
            "Smith", "John", "Stepanovich", "Smith J.",
            "John123",
            "Text.",
            "0937654321", "0931234567",
            "john@gmail.com",
            "john12",
            "12345", "Kyiv", "Grygorenka", "5", "123", "12345, Kyiv, Grygorenka, house:5, apartment:123"),
    RECORD_TWO(Group.FAMILY,
            "Qwerty", "Andrew", "Ivanovich", "Qwerty A.",
            "John123",
            "Text.",
            "0937654321", "0931234567",
            "john@gmail.com",
            "john12",
            "12345", "Kyiv", "Grygorenka", "1", "4", "12345, Kyiv, Grygorenka, house:1, apartment:4");


    private FullName fullName;

    private String nick;

    private String description;

    private Group group;

    private Telephone telephone;

    private String email;

    private String skype;

    private Address address;

    RecordExample(Group group, String surname, String name, String patronymic, String truncatedName,
                  String nick, String description, String mainTelephone, String spareTelephone,
                  String email, String skype, String index, String city, String street, String houseNumber,
                  String apartmentNumber, String fullAddress) {
        this.group = group;
        fullName = new FullName(surname, name, patronymic, truncatedName);
        this.nick = nick;
        this.description = description;
        telephone = new Telephone(mainTelephone, spareTelephone);
        this.email = email;
        this.skype = skype;
        address = new Address(index, city, street, houseNumber, apartmentNumber, fullAddress);
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
}
