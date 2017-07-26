package ua.com.andrewserbin.model.entity;

/**
 * Created by layer on 26.07.2017.
 */
public class Address {

    private String index;

    private String city;

    private String street;

    private String houseNumber;

    private String apartmentNumber;

    private String fullAddress;

    public Address(String index, String city, String street, String houseNumber, String apartmentNumber, String fullAddress) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.fullAddress = fullAddress;
    }
}
