package com.qa.tbs.services;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import com.qa.tbs.utils.Utils;

public enum Commands {
    CREATE("Create a new entity in the database"), READ("Read an entity from the database"),
    UPDATE("Change an entity in the database"), DELETE("Remove an entity from the database"),
    RETURN("Go back in the menu");

    public static final Logger LOGGER = LogManager.getLogger(Commands.class.getName());

    private final String description;

    Commands(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.name() + ": " + this.description;
    }

    public static void printCommands() {
        for (Commands commands : Commands.values()) {
            LOGGER.info(commands.getDescription());
        }
    }

    public static Commands getCommands(Utils utils) {
        Commands commands = null;
        do {
            try {
                commands = Commands.valueOf(utils.getString().toUpperCase());
            } catch (IllegalArgumentException e) {
                LOGGER.error("Invalid selection. Please try again.");
            }
        } while (commands == null);
        return commands;
    }
}
