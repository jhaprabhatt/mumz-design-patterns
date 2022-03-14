package com.mumz.learn.design.patterns.state;

import com.mumz.learn.design.patterns.state.tools.Tool;
import com.mumz.learn.design.patterns.state.tools.impl.Brush;
import com.mumz.learn.design.patterns.state.tools.impl.Eraser;
import com.mumz.learn.design.patterns.state.tools.impl.Selection;

public class StateApplication {

    public static void main(String[] args) {
        var canvas = new Canvas();
        changeToolAndDoWork(canvas, Selection.builder().build());

        changeToolAndDoWork(canvas, Brush.builder().build());

        changeToolAndDoWork(canvas, Eraser.builder().build());
    }

    private static void changeToolAndDoWork(Canvas canvas, Tool too) {
        canvas.changeCurrentSelectedTool(too);
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
