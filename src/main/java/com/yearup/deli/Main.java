package com.yearup.deli;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.displayHomeScreen();
        UserInterface ui = new UserInterface();
        ui.displayAddScreen();
    }
}
