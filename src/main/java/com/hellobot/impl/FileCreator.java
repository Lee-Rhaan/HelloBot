package com.hellobot.impl;

import java.awt.*;

import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.impl.commands.HelloWorldCommand.helloWorldCode;
import static com.hellobot.impl.commands.JavaClassCommand.javaClass;
import static com.hellobot.impl.commands.MainMethodCommand.javaMainMethod;
import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class creates a new valid java file
 */

public class FileCreator {

    /**
     * Creates a java file + a sample hello world println
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void createJavaFile(Robot robot) throws Exception {
        //copy
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(P_BUTTON);
        robot.keyRelease(P_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(Y_BUTTON);
        robot.keyRelease(Y_BUTTON);
        sleepForHalfSecond();

        pressSpace(robot);

        //con
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(N_BUTTON);
        robot.keyRelease(N_BUTTON);
        sleepForHalfSecond();

        pressSpace(robot);

        //Java file name -> HelloBot
        inputText(robot, HELLO_BOT_TEXT);
        pressPeriod(robot);
        //Java file extensions -> .java
        inputText(robot, JAVA_TEXT);

        pressEnter(robot);
        Thread.sleep(1000);
        pressEnter(robot);
        sleepForHalfSecond();

        //java class logic
        javaFileContent(robot);

        //exit edit mode and save file
        robot.keyPress(CONTROL_BUTTON);
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        robot.keyRelease(CONTROL_BUTTON);
        sleepForTwoSeconds();
    }

    /**
     * Programs the content of the java file
     * @param robot executes keyboard operations
     * @throws Exception
     */
    private static void javaFileContent(Robot robot) throws Exception {
        //create java class
        javaClass(robot);
        //create main method
        javaMainMethod(robot);
        //print out hello world logic
        helloWorldCode(robot);

        //} main method closing bracket
        closeCurlyBrace(robot);

        pressEnter(robot);
        sleepForHalfSecond();

        //} class closing bracket
        closeCurlyBrace(robot);

        pressEnter(robot);
        sleepForHalfSecond();
    }

}
