package com.radhsyn83;

public class Kerucut extends BangunRuang {
    private double t;
    private double r;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {

        return (1 * 3);
    }
}