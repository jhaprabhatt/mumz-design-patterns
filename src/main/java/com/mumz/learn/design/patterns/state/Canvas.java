package com.mumz.learn.design.patterns.state;

import com.mumz.learn.design.patterns.state.tools.Tool;

public class Canvas {

    private Tool currentSelectedTool;

    public void changeCurrentSelectedTool(final Tool tool) {
        currentSelectedTool = tool;
    }

    public void mouseUp(){
        currentSelectedTool.mouseUp();
    }

    public void mouseDown() {
        currentSelectedTool.mouseDown();
    }
}
