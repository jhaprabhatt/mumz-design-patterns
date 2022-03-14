package com.mumz.learn.design.patterns.command.excercise;

public interface UndoableCommand extends Command{

    void unexecute();
}
