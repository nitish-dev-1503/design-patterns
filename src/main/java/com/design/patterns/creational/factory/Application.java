package com.design.patterns.creational.factory;

public class Application {
    private static Logistics logistics;

    private enum mode {ROAD, SEA}

    public static void main(String[] args) {
        var mode = Application.mode.ROAD;
        init(mode);
        logistics.planDelivery();
    }

    private static void init(mode mode) {
        switch (mode) {
            case ROAD -> logistics = new RoadLogistics();
            case SEA -> logistics = new SeaLogistics();
        }
    }
}
