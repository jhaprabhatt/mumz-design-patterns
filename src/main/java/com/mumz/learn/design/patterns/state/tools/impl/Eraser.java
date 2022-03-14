package com.mumz.learn.design.patterns.state.tools.impl;

import com.mumz.learn.design.patterns.state.tools.Tool;
import lombok.Builder;

@Builder
public class Eraser implements Tool {
    @Override
    public void mouseUp() {
        System.out.println(Eraser.class.getSimpleName() + " mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println(Eraser.class.getSimpleName() + " mouse down");
    }
}
