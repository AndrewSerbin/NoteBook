package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.view.View;
import ua.com.andrewserbin.view.ViewConstants;
import java.util.Scanner;

/**
 * Created by layer on 26.07.2017.
 */
public class ScannerRegexController {

    private View view;

    public ScannerRegexController(View view) {
        this.view = view;
    }

    public String inputStringInAccordanceWithRegex(Scanner sc, String inputProperty, String regex) {
        String inputMessage = getMessageFromBundle(inputProperty);

        view.printMessage(inputMessage);

        while (!sc.hasNext(regex)) {
            view.printMessage(getMessageFromBundle(ViewConstants.WRONG_INPUT), inputMessage);

            sc.next();
        }

        return sc.next();
    }

    private String getMessageFromBundle(String propertyName) {
        return view.getBundle().getString(propertyName);
    }
}
