package ua.com.andrewserbin.controller;

import org.junit.Assert;
import org.junit.Test;

public class InputNoteBookControllerTest {

    @Test
    public void checkGroupRegexWithCorrectGroupTest() throws Exception {
        String correctGroup = "family";

        Assert.assertTrue(correctGroup.matches(RegexConstants.REGEX_GROUP));
    }

    @Test
    public void checkGroupRegexWithWrongGroupTest() throws Exception {
        String wrongEmail = "qwerty";

        Assert.assertFalse(wrongEmail.matches(RegexConstants.REGEX_GROUP));
    }

    @Test
    public void checkNameRegexWithCorrectNameTest() throws Exception {
        String correctName = "John";

        Assert.assertTrue(correctName.matches(RegexConstants.REGEX_NAME));
    }

    @Test
    public void checkNameRegexWithWrongNameTest() throws Exception {
        String wrongName = "123";

        Assert.assertFalse(wrongName.matches(RegexConstants.REGEX_NAME));
    }

    @Test
    public void checkNickRegexWithCorrectNickTest() throws Exception {
        String correctNick = "John123";

        Assert.assertTrue(correctNick.matches(RegexConstants.REGEX_NICK));
    }

    @Test
    public void checkNickRegexWithWrongNickTest() throws Exception {
        String wrongNick = "%^&";

        Assert.assertFalse(wrongNick.matches(RegexConstants.REGEX_NICK));
    }

    @Test
    public void checkDescriptionRegexWithCorrectDescriptionTest() throws Exception {
        String correctDescription = "Text.";

        Assert.assertTrue(correctDescription.matches(RegexConstants.REGEX_DESCRIPTION));
    }

    @Test
    public void checkDescriptionRegexWithWrongDescriptionTest() throws Exception {
        String wrongDescription = "{}";

        Assert.assertFalse(wrongDescription.matches(RegexConstants.REGEX_DESCRIPTION));
    }

    @Test
    public void checkTelephoneRegexWithCorrectTelephoneTest() throws Exception {
        String correctTelephone = "0931234567";

        Assert.assertTrue(correctTelephone.matches(RegexConstants.REGEX_TELEPHONE));
    }

    @Test
    public void checkTelephoneRegexWithWrongTelephoneTest() throws Exception {
        String wrongTelephone = "qwerty";

        Assert.assertFalse(wrongTelephone.matches(RegexConstants.REGEX_TELEPHONE));
    }

    @Test
    public void checkEmailRegexWithCorrectEmailTest() throws Exception {
        String correctEmail = "john@gmail.com";

        Assert.assertTrue(correctEmail.matches(RegexConstants.REGEX_EMAIL));
    }

    @Test
    public void checkEmailRegexWithWrongEmailTest() throws Exception {
        String wrongEmail = "qwerty@";

        Assert.assertFalse(wrongEmail.matches(RegexConstants.REGEX_EMAIL));
    }

    @Test
    public void checkSkypeRegexWithCorrectSkypeTest() throws Exception {
        String correctSkype = "jonh123";

        Assert.assertTrue(correctSkype.matches(RegexConstants.REGEX_SKYPE));
    }

    @Test
    public void checkSkypeRegexWithWrongSkypeTest() throws Exception {
        String wrongSkype = "%^&";

        Assert.assertFalse(wrongSkype.matches(RegexConstants.REGEX_SKYPE));
    }

    @Test
    public void checkIndexRegexWithCorrectIndexTest() throws Exception {
        String correctIndex = "12345";

        Assert.assertTrue(correctIndex.matches(RegexConstants.REGEX_INDEX));
    }

    @Test
    public void checkIndexRegexWithWrongIndexTest() throws Exception {
        String wrongIndex = "qwerty";

        Assert.assertFalse(wrongIndex.matches(RegexConstants.REGEX_INDEX));
    }

    @Test
    public void checkCityRegexWithCorrectCityTest() throws Exception {
        String correctCity = "Kyiv";

        Assert.assertTrue(correctCity.matches(RegexConstants.REGEX_CITY_AND_STREET));
    }

    @Test
    public void checkCityRegexWithWrongCityTest() throws Exception {
        String wrongCity = "1234";

        Assert.assertFalse(wrongCity.matches(RegexConstants.REGEX_CITY_AND_STREET));
    }

    @Test
    public void checkHouseNumberRegexWithCorrectHouseNumberTest() throws Exception {
        String correctHouseNumber = "123";

        Assert.assertTrue(correctHouseNumber.matches(RegexConstants.REGEX_HOUSE_AND_APARTMENT_NUMBER));
    }

    @Test
    public void checkHouseNumberRegexWithWrongHouseNumberTest() throws Exception {
        String wrongHouseNumber = "qwerty";

        Assert.assertFalse(wrongHouseNumber.matches(RegexConstants.REGEX_HOUSE_AND_APARTMENT_NUMBER));
    }
}