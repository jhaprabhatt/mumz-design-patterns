package com.mumz.learn.design.patterns.state.excercise.mode.impl;

import com.mumz.learn.design.patterns.state.excercise.mode.TravelMode;

public class Walking implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println(getEtaMessage("walking"));
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println(getDirectionMessage("walking"));
        return 4;
    }
}
