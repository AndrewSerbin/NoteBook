package ua.com.andrewserbin.model.entity;

/**
 * Created by layer on 26.07.2017.
 */
public class Telephone {

    private String mainTelephone;

    private String spareTelephone;

    public Telephone(String mainTelephone, String spareTelephone) {
        this.mainTelephone = mainTelephone;
        this.spareTelephone = spareTelephone;
    }
}
