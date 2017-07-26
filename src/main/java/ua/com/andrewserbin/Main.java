package ua.com.andrewserbin;

import ua.com.andrewserbin.controller.Controller;
import ua.com.andrewserbin.model.Model;
import ua.com.andrewserbin.view.View;

public class Main {

    public static void main( String[] args ) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
