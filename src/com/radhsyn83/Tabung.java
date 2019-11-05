package com.radhsyn83;

public class Tabung extends BangunRuang{
    private double r;
    private double h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double hitungVolume() {
        return 3.14 * r * r * h;
    }
}
