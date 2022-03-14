package com.mumz.learn.design.patterns.command.excercise;

import lombok.Data;

@Data
public class ContrastCommand implements UndoableCommand {

    private VideoEditor videoEditor;
    private History history;
    private float contrast = 0.5f;
    private float previousContrast;
    public ContrastCommand(
            VideoEditor videoEditor,
            History history
    ) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContrast = videoEditor.getContrast();
        history.push(this);
        videoEditor.applyContrast(contrast);
        System.out.println("Applying Contrast");
    }

    @Override
    public void unexecute() {
        videoEditor.applyContrast(previousContrast);
    }
}
