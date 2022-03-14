package com.mumz.learn.design.patterns.state.tools.excercise.mode;

public interface TravelMode {

    String ETA_START = "Calculating ETA (";
    String END = ")";
    String DIRECTION_START = "Calculating Direction (";

    Object getEta();

    Object getDirection();

    default String getEtaMessage(final String type) {
        return ETA_START + type + END;
    }

    default String getDirectionMessage(final String type) {
        return DIRECTION_START + type + END;
    }
}
