package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.view.View;
import ua.com.andrewserbin.view.ViewConstants;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by layer on 26.07.2017.
 */
public class ScannerRegexController {

    private View view;

    public ScannerRegexController(View view) {
        this.view = view;
    }

    public String inputStringInAccordanceWithRegex(Scanner sc, String outputMessage, String regex) {
        view.printMessage(outputMessage);

        while (!sc.hasNext(regex)) {
            view.printMessage(ViewConstants.WRONG_INPUT + outputMessage);

            sc.next();
        }

        return sc.next();
    }
}
