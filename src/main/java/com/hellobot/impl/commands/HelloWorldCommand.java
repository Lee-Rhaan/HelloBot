package com.hellobot.impl.commands;

import java.awt.*;

import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class is responsible for the hello world println code inside the main method
 */

public class HelloWorldCommand {

    /**
     * Programs a hello world println logic
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void helloWorldCode(Robot robot) throws Exception {
        //System
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(Y_BUTTON);
        robot.keyRelease(Y_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(E_BUTTON);
        robot.keyRelease(E_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(M_BUTTON);
        robot.keyRelease(M_BUTTON);
        sleepForHalfSecond();

        //dot separator
        pressPeriod(robot);

        //out
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(U_BUTTON);
        robot.keyRelease(U_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();

        //dot separator
        pressPeriod(robot);

        //println
        robot.keyPress(P_BUTTON);
        robot.keyRelease(P_BUTTON);
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
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(L_BUTTON);
        robot.keyRelease(L_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(N_BUTTON);
        robot.keyRelease(N_BUTTON);
        sleepForHalfSecond();

        //("
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(BUTTON_9);
        robot.keyRelease(BUTTON_9);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(QUOTE_BUTTON);
        robot.keyRelease(QUOTE_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();

        //Hello
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(H_BUTTON);
        robot.keyRelease(H_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(E_BUTTON);
        robot.keyRelease(E_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(L_BUTTON);
        robot.keyRelease(L_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(L_BUTTON);
        robot.keyRelease(L_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();

        pressSpace(robot);

        //World
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(W_BUTTON);
        robot.keyRelease(W_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(R_BUTTON);
        robot.keyRelease(R_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(L_BUTTON);
        robot.keyRelease(L_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(D_BUTTON);
        robot.keyRelease(D_BUTTON);
        sleepForHalfSecond();

        //");
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(QUOTE_BUTTON);
        robot.keyRelease(QUOTE_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(BUTTON_0);
        robot.keyRelease(BUTTON_0);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(SEMICOLON_BUTTON);
        robot.keyRelease(SEMICOLON_BUTTON);
        sleepForHalfSecond();

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
