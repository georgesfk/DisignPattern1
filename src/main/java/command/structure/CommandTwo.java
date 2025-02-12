package com.Usine.command.structure;

import java.util.Stack;

public class CommandTwo implements Command {

    Stack<String> commands = new Stack<>();
    int index = 0;

    @Override
    public void execute() {
        System.out.println("execute command two # " + index);
        commands.push("execute command two # " + index++);
    }

    @Override
    public void undo() {
        if (commands.size() > 0) {
            String pop = commands.pop();
            System.out.println("undo command \"" + pop + "\"");
        }
    }
}
