package ua.com.andrewserbin.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputNoteBookControllerTest {

    @Test
    public void checkEmailRegexWithCorrectEmailTest() throws Exception {
        String correctEmail = "qwerty@gmail.com";

        Assert.assertTrue(correctEmail.matches(RegexConstants.REGEX_EMAIL));
    }

    @Test
    public void checkEmailRegexWithWrongEmailTest() throws Exception {
        String wrongEmail = "qwerty@";

        Assert.assertFalse(wrongEmail.matches(RegexConstants.REGEX_EMAIL));
    }

}