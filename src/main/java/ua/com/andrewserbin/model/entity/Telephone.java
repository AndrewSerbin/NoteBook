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

    public String getMainTelephone() {
        return mainTelephone;
    }

    public void setMainTelephone(String mainTelephone) {
        this.mainTelephone = mainTelephone;
    }

    public String getSpareTelephone() {
        return spareTelephone;
    }

    public void setSpareTelephone(String spareTelephone) {
        this.spareTelephone = spareTelephone;
    }
}
