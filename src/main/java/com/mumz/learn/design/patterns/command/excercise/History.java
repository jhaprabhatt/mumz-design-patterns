package com.mumz.learn.design.patterns.command.excercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class History {

    public Deque<UndoableCommand> history = new ArrayDeque<>();

    public Optional<UndoableCommand> pop() {
        if (history.isEmpty()) return Optional.empty();
        return Optional.of(history.pop());
    }

    public void push(UndoableCommand undoableCommand) {
        history.push(undoableCommand);
    }
}
