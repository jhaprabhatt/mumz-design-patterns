package com.mumz.learn.design.patterns.state.tools.impl;

import com.mumz.learn.design.patterns.state.tools.Tool;
import lombok.Builder;

@Builder
public class Brush implements Tool {
    @Override
    public void mouseUp() {
        System.out.println(Brush.class.getSimpleName() + " mouse up");
    }

    @Override
    public void mouseDown() {
        System.out.println(Brush.class.getSimpleName() + " mouse down");
    }
}
