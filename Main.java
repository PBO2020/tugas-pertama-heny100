package com.company;

public class Main {
    public static void main(String[] args) {

        secondclass oop = new secondclass();
        oop.setangka1(5);
        oop.setangka2(10);
        oop.setHasil(oop.getangka2() + oop.getangka2());
        System.out.println("Angka 1  = " +oop.getangka1());
        System.out.println("Angka  2 = " +oop.getangka2());
        System.out.println("Hasilnya = "+oop.getHasil1());
        System.out.println("Hasilnya = "+oop.getHasil2());
        System.out.println("Hasilnya = "+oop.getHasil3());

    }
}
