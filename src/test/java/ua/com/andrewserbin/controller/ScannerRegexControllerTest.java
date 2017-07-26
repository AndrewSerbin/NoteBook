package ua.com.andrewserbin.controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by layer on 26.07.2017.
 */
public class ScannerRegexControllerTest {

    @Test
    public void inputStringInAccordanceWithRegex() throws Exception {
        ScannerRegexController.inputStringInAccordanceWithRegex("", "");
    }
}