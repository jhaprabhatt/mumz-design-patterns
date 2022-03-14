package com.mumz.learn.design.patterns.command.excercise;

import java.util.Optional;

public class UndoCommand implements Command {

    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        Optional<UndoableCommand> previousCommand = history.pop();
        if (previousCommand.isPresent()) previousCommand.get().unexecute();
    }
}
