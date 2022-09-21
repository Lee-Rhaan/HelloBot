package com.hellobot.impl;

import java.awt.*;

import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class creates the directory structure of this program
 */

public class ProjectStructure {

    /**
     * Creates the basic project structure of a java program
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void createProjectStructure(Robot robot) throws Exception {
        //create new folder in Documents dir -> named "HelloBot"
        createNewFolder(robot);
        sleepForTwoSeconds();
        inputText(robot, HELLO_BOT_TEXT);
        pressEnter(robot);
        sleepForFourSeconds();

        //open HelloBot folder
        pressEnter(robot);
        sleepForTwoSeconds();
        //create new folder in HelloBot dir -> named "src"
        createNewFolder(robot);
        sleepForTwoSeconds();
        inputText(robot, SRC_TEXT);
        pressEnter(robot);
        sleepForFourSeconds();

        //open src folder
        pressEnter(robot);
        sleepForTwoSeconds();
        //create new folder in src dir -> named "main"
        createNewFolder(robot);
        sleepForTwoSeconds();
        inputText(robot, MAIN_TEXT);
        pressEnter(robot);
        sleepForFourSeconds();

        //open main folder
        pressEnter(robot);
        sleepForTwoSeconds();
        //create new folder in main dir -> named "java"
        createNewFolder(robot);
        sleepForTwoSeconds();
        inputText(robot, JAVA_TEXT);
        pressEnter(robot);
        sleepForFourSeconds();

        //open java folder
        pressEnter(robot);
        sleepForTwoSeconds();
    }

}
