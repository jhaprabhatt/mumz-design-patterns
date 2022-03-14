package com.mumz.learn.design.patterns.command.excercise;

import lombok.Data;
import lombok.Getter;

@Getter
public class VideoEditor {
    private float contrast = 0.5f;
    private String text;

    public void applyContrast(final float contrast){
        this.contrast = contrast;
        System.out.println("Contrast applied");
    }

    public void addText(final String text) {
        this.text = text;
    }
}
