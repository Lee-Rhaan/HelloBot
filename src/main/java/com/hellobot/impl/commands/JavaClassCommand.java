package com.hellobot.impl.commands;

import java.awt.*;

import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class is responsible for creating a java class
 */

public class JavaClassCommand {

    /**
     * Programs a java class inside the java file
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void javaClass(Robot robot) throws Exception {
        //public
        inputText(robot, PUBLIC_TEXT);
        pressSpace(robot);

        //class
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(L_BUTTON);
        robot.keyRelease(L_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(A_BUTTON);
        robot.keyRelease(A_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        sleepForHalfSecond();
        pressSpace(robot);

        //name class "HelloBot"
        inputText(robot, HELLO_BOT_TEXT);
        pressSpace(robot);
        openCurlyBrace(robot);

        //new line
        pressEnter(robot);
        sleepForHalfSecond();
        pressEnter(robot);
        sleepForHalfSecond();

        //Indent code
        pressSpace(robot);
        pressSpace(robot);
        pressSpace(robot);
    }

}
