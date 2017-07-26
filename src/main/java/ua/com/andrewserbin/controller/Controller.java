package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.model.Model;
import ua.com.andrewserbin.view.View;

/**
 * Created by layer on 26.07.2017.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {

    }
}
