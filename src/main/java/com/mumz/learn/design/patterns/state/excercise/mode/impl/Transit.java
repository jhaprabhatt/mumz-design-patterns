package com.mumz.learn.design.patterns.state.excercise.mode.impl;

import com.mumz.learn.design.patterns.state.excercise.mode.TravelMode;

public class Transit implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println(getEtaMessage("transit"));
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println(getDirectionMessage("transit"));
        return 3;
    }
}
