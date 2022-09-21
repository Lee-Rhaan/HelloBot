package com.hellobot;

import java.awt.*;

import static com.hellobot.impl.FileCreator.createJavaFile;
import static com.hellobot.impl.KeyBoardOperations.*;
import static com.hellobot.impl.ProjectStructure.createProjectStructure;
import static com.hellobot.impl.commands.CompileApplication.compileCode;
import static com.hellobot.impl.commands.CompileApplication.runCode;

/**
 * This application creates a Hello World project complete with its project structure etc. then
 * compiles/execute the code automatically
 */
public class HelloBot {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            projectDirectory(robot);

            createProjectStructure(robot);

            commandTerminal(robot);

            createJavaFile(robot);

            compileCode(robot);

            runCode(robot);

        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

}
