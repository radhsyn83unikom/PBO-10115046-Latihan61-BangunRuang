package com.radhsyn83;

public class Bola extends BangunRuang{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (4 * 3.14 * r * r * r) / 3;
    }

}