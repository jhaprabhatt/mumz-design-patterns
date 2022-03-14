package com.mumz.learn.design.patterns.state.tools.excercise;

import com.mumz.learn.design.patterns.state.tools.excercise.mode.TravelMode;

import static java.util.Objects.requireNonNull;

public class DirectionService {
    private TravelMode travelMode;

    public void setTravelMode(final TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getEta() {
        requireNonNull(this.travelMode);
        return travelMode.getEta();
    }

    public Object getDirection() {
        requireNonNull(this.travelMode);
        return travelMode.getEta();
    }
}
