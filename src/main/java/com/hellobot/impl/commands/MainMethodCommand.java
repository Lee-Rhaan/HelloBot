package com.hellobot.impl.commands;

import java.awt.*;

import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class is responsible for creating the main method
 */

public class MainMethodCommand {

    /**
     * Creates the main method inside the java class
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void javaMainMethod(Robot robot) throws Exception {
        //public
        inputText(robot, PUBLIC_TEXT);
        pressSpace(robot);

        //static
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(A_BUTTON);
        robot.keyRelease(A_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(I_BUTTON);
        robot.keyRelease(I_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();
        pressSpace(robot);

        //void
        robot.keyPress(V_BUTTON);
        robot.keyRelease(V_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(I_BUTTON);
        robot.keyRelease(I_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(D_BUTTON);
        robot.keyRelease(D_BUTTON);
        sleepForHalfSecond();
        pressSpace(robot);

        //main
        inputText(robot, MAIN_TEXT);
        pressSpace(robot);

        //(String
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(BUTTON_9);
        robot.keyRelease(BUTTON_9);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(R_BUTTON);
        robot.keyRelease(R_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(I_BUTTON);
        robot.keyRelease(I_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(N_BUTTON);
        robot.keyRelease(N_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(G_BUTTON);
        robot.keyRelease(G_BUTTON);
        sleepForHalfSecond();

        //[]
        robot.keyPress(OPEN_BRACKET_BUTTON);
        robot.keyRelease(OPEN_BRACKET_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(CLOSE_BRACKET_BUTTON);
        robot.keyRelease(CLOSE_BRACKET_BUTTON);
        sleepForHalfSecond();
        pressSpace(robot);

        //args)
        robot.keyPress(A_BUTTON);
        robot.keyRelease(A_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(R_BUTTON);
        robot.keyRelease(R_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(G_BUTTON);
        robot.keyRelease(G_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(BUTTON_0);
        robot.keyRelease(BUTTON_0);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        pressSpace(robot);

        openCurlyBrace(robot);
        pressEnter(robot);
        sleepForHalfSecond();
        pressEnter(robot);
        sleepForHalfSecond();

        //Indent code
        pressSpace(robot);
        pressSpace(robot);
        pressSpace(robot);
        pressSpace(robot);
        pressSpace(robot);
        pressSpace(robot);
    }

}
