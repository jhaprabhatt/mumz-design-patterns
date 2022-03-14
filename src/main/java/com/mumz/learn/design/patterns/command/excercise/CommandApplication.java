package com.mumz.learn.design.patterns.command.excercise;

public class CommandApplication {

    public static void main(String[] args) {
        var history = new History();
        var videoEditor = new VideoEditor();

        videoEditor.addText("SomeText");

        var contrastCommand = new ContrastCommand(videoEditor, history);
        contrastCommand.setContrast(0.8f);
        contrastCommand.execute();

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
    }
}
