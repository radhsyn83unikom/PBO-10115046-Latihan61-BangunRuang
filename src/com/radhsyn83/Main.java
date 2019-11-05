package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bola nBola = new Bola();
        nBola.setR(7);
        System.out.println("1. Volume Bola :");
        System.out.printf("   Hasil = %,12.1f%n", (double) nBola.hitungVolume());
        System.out.println("");

        Tabung nTabung = new Tabung();
        nTabung.setH(21);
        nTabung.setR(10);
        System.out.println("2. Volume Tabung : ");
        System.out.println("Hasil = " + (int) nTabung.hitungVolume());
        System.out.println("");

        Kerucut nKerucut = new Kerucut();
        nKerucut.setR(14);
        nKerucut.setT(9);
        System.out.println("3. Volume Kerucut : ");
        System.out.println("   Hasil = " + (int) nKerucut.hitungVolume());
    }
}
