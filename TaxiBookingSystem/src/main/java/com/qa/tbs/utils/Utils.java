package com.qa.tbs.utils;

import java.util.Scanner;
import org.apache.log4j.*;

public class Utils {

    // setting rules for input
    private static final Logger LOGGER = LogManager.getLogger("");

    private final Scanner scanner;

    public Utils(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    public Utils() {
        scanner = new Scanner(System.in);
    }

    public Long getLong() {
        String input = null;
        Long longInput = null;
        do {
            try {
                input = getString();
                longInput = Long.parseLong(input);
            } catch (NumberFormatException nfe) {
                LOGGER.info("Error - Please enter a number");
            }
        } while (longInput == null);
        return longInput;
    }

    public String getString(){
        return scanner.nextLine();
    }

    public Float getFloat() {
        String input = null;
        Float floatInput = null;
        do {
            try {
                input = getString();
                floatInput = Float.parseFloat(input);
            } catch (NumberFormatException nfe) {
                LOGGER.info("Error - Please enter a number");
            }
        } while (floatInput == null);
        return floatInput;
    }

}
