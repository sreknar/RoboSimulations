package com.locomoto.robotsimulation.helper;

import static org.apache.commons.lang.StringUtils.trim;

/**
 * Exception to indicate that an unknown command had been issued.
 * <p/>
 * author:rajesh
 * version:1.0.1
 */
public class MalformedCommandException extends InvalidCommandException{

    private final String commandString;

    /**
     * @param commandString command string
     */
    public MalformedCommandException(String commandString) {
        super(String.format("Unknown command has been given [%s]", commandString));
        this.commandString = trim(commandString);
    }

    /**
     * @return the invalid command
     */
    public String getCommandString() {
        return commandString;
    }
}
