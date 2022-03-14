package com.mumz.learn.design.patterns.state.tools.excercise.mode.impl;

import com.mumz.learn.design.patterns.state.tools.excercise.mode.TravelMode;

public class Driving implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println(getEtaMessage("driving"));
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println(getDirectionMessage("driving"));
        return 1;
    }
}
