package com.hellobot.impl;

import java.awt.*;

import static com.hellobot.util.ApplicationConstants.*;

/**
 * This class contains different Windows keyboard operations that will be used throughout
 * this application.
 */

public class KeyBoardOperations {

    /**
     * Opens the Windows default run gui
     * @param robot executes keyboard operations
     */
    public static void openWindowsRunGui(Robot robot) {
        robot.keyPress(WINDOWS_BUTTON);
        robot.keyPress(R_BUTTON);
        robot.keyRelease(R_BUTTON);
        robot.keyRelease(WINDOWS_BUTTON);
    }

    /**
     * Types the text "Documents".
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void openDocumentFolder(Robot robot) throws Exception {
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(D_BUTTON);
        robot.keyRelease(D_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(O_BUTTON);
        robot.keyRelease(O_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(U_BUTTON);
        robot.keyRelease(U_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(M_BUTTON);
        robot.keyRelease(M_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(E_BUTTON);
        robot.keyRelease(E_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(N_BUTTON);
        robot.keyRelease(N_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(T_BUTTON);
        robot.keyRelease(T_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(S_BUTTON);
        robot.keyRelease(S_BUTTON);
        sleepForHalfSecond();
    }

    /**
     * Executes the enter button
     * @param robot executes keyboard operations
     */
    public static void pressEnter(Robot robot) {
        robot.keyPress(ENTER_BUTTON);
        robot.keyRelease(ENTER_BUTTON);
    }

    /**
     * Executes the space button
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void pressSpace(Robot robot) throws Exception {
        robot.keyPress(SPACE_BUTTON);
        robot.keyRelease(SPACE_BUTTON);
        sleepForHalfSecond();
    }

    /**
     * Executes the period button
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void pressPeriod(Robot robot) throws Exception {
        robot.keyPress(PERIOD_BUTTON);
        robot.keyRelease(PERIOD_BUTTON);
        sleepForHalfSecond();
    }

    /**
     * Creates a new folder in the current directory
     * @param robot executes keyboard operations
     */
    public static void createNewFolder(Robot robot) {
        robot.keyPress(CONTROL_BUTTON);
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(N_BUTTON);
        robot.keyRelease(CONTROL_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        robot.keyRelease(N_BUTTON);
    }

    /**
     * Jumps the input pipe to the address bar of the current directory
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void jumpToAddressBar(Robot robot) throws Exception {
        robot.keyPress(CONTROL_BUTTON);
        robot.keyPress(L_BUTTON);
        robot.keyRelease(L_BUTTON);
        robot.keyRelease(CONTROL_BUTTON);
        Thread.sleep(1000);
    }

    /**
     * Inputs the text "cmd"
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void openCMD(Robot robot) throws Exception {
        robot.keyPress(C_BUTTON);
        robot.keyRelease(C_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(M_BUTTON);
        robot.keyRelease(M_BUTTON);
        sleepForHalfSecond();
        robot.keyPress(D_BUTTON);
        robot.keyRelease(D_BUTTON);
        sleepForHalfSecond();
    }

    /**
     * Inputs the open curly brace character
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void openCurlyBrace(Robot robot) throws Exception {
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(OPEN_BRACKET_BUTTON);
        robot.keyRelease(OPEN_BRACKET_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
    }

    /**
     * Inputs the close curly brace character
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void closeCurlyBrace(Robot robot) throws Exception {
        robot.keyPress(SHIFT_BUTTON);
        robot.keyPress(CLOSE_BRACKET_BUTTON);
        robot.keyRelease(CLOSE_BRACKET_BUTTON);
        robot.keyRelease(SHIFT_BUTTON);
        sleepForHalfSecond();
    }

    /**
     * Search and opens the Documents folder
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void projectDirectory(Robot robot) throws Exception {
        openWindowsRunGui(robot);
        sleepForFourSeconds();
        openDocumentFolder(robot);
        pressEnter(robot);
        Thread.sleep(8000);
    }

    /**
     * Opens the command terminal in the current directory.
     * @param robot executes keyboard operations
     * @throws Exception
     */
    public static void commandTerminal(Robot robot) throws Exception {
        jumpToAddressBar(robot);
        openCMD(robot);
        pressEnter(robot);
        Thread.sleep(4500);
    }


    /**
     * Stops the flow of the application for 0.5 seconds
     * @throws Exception
     */
    public static void sleepForHalfSecond() throws Exception {
        Thread.sleep(500);
    }

    /**
     * Stops the flow of the application for 2 seconds
     * @throws Exception
     */
    public static void sleepForTwoSeconds() throws Exception {
        Thread.sleep(2000);
    }

    /**
     * Stops the flow of the application for 4 seconds
     * @throws Exception
     */
    public static void sleepForFourSeconds() throws Exception {
        Thread.sleep(4000);
    }

    /**
     * Types the specified available text by using the first letter of the
     * text as a reference.
     *
     * @param robot executes keyboard operations
     * @param folderNameReference determines which text to type
     * @throws Exception
     */
    public static void inputText(Robot robot, String folderNameReference) throws Exception {
        if ("H".equalsIgnoreCase(folderNameReference)) {
            //HelloBot
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
            robot.keyPress(SHIFT_BUTTON);
            robot.keyPress(B_BUTTON);
            robot.keyRelease(B_BUTTON);
            robot.keyRelease(SHIFT_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(O_BUTTON);
            robot.keyRelease(O_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(T_BUTTON);
            robot.keyRelease(T_BUTTON);
            sleepForHalfSecond();
        } else if ("S".equalsIgnoreCase(folderNameReference)) {
            //src
            robot.keyPress(S_BUTTON);
            robot.keyRelease(S_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(R_BUTTON);
            robot.keyRelease(R_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(C_BUTTON);
            robot.keyRelease(C_BUTTON);
            sleepForHalfSecond();
        } else if ("M".equalsIgnoreCase(folderNameReference)) {
            //main
            robot.keyPress(M_BUTTON);
            robot.keyRelease(M_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(A_BUTTON);
            robot.keyRelease(A_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(I_BUTTON);
            robot.keyRelease(I_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(N_BUTTON);
            robot.keyRelease(N_BUTTON);
            sleepForHalfSecond();
        } else if ("J".equalsIgnoreCase(folderNameReference)) {
            //java
            robot.keyPress(J_BUTTON);
            robot.keyRelease(J_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(A_BUTTON);
            robot.keyRelease(A_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(V_BUTTON);
            robot.keyRelease(V_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(A_BUTTON);
            robot.keyRelease(A_BUTTON);
            sleepForHalfSecond();
        } else if ("P".equalsIgnoreCase(folderNameReference)) {
            //public
            robot.keyPress(P_BUTTON);
            robot.keyRelease(P_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(U_BUTTON);
            robot.keyRelease(U_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(B_BUTTON);
            robot.keyRelease(B_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(L_BUTTON);
            robot.keyRelease(L_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(I_BUTTON);
            robot.keyRelease(I_BUTTON);
            sleepForHalfSecond();
            robot.keyPress(C_BUTTON);
            robot.keyRelease(C_BUTTON);
            sleepForHalfSecond();
        }
    }

}
