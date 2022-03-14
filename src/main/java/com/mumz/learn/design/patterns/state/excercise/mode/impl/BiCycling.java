package com.mumz.learn.design.patterns.state.excercise.mode.impl;

import com.mumz.learn.design.patterns.state.excercise.mode.TravelMode;

public class BiCycling implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println(getEtaMessage("bicycling"));
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println(getDirectionMessage("bicycling"));
        return 2;
    }
}
