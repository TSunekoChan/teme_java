package aut.isp.lab4.exercise3;

import aut.isp.lab4.exercise2.AquariumController;

public class FishFeeder {
    private AquariumController manufacturer;
    private AquariumController model;
    private int meals = 14;

    public void feed(int meals) {
        this.meals -= meals;
        System.out.println("we fed a fish");


    }

    public void fillUp(int meals) {
        this.meals += meals;
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer=" + manufacturer +
                ", model=" + model +
                ", meals=" + meals +
                '}';
    }
}