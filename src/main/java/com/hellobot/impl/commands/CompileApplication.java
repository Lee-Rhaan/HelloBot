package com.hellobot.impl.commands;

import java.awt.*;

import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class compiles and runs the created java application
 */

public class CompileApplication {

    /**
     * Compiles the java application
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void compileCode(Robot robot) throws Exception {
        //javac
        inputText(robot, JAVA_TEXT);
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();

        pressSpace(robot);

        //HelloBot
        inputText(robot, HELLO_BOT_TEXT);

        //dot separator
        pressPeriod(robot);

        //java extension
        inputText(robot, JAVA_TEXT);

        pressEnter(robot);
        Thread.sleep(5000);
    }

    /**
     * Executes the java application
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void runCode(Robot robot) throws Exception {
        //java
        inputText(robot, JAVA_TEXT);

        pressSpace(robot);

        //HelloBot
        inputText(robot, HELLO_BOT_TEXT);

        pressEnter(robot);
    }

}
