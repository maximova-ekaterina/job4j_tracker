package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charging) {
        this.load = charging;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery varta = new Battery(100);
        Battery bosch = new Battery(52);
        System.out.println("varta : " + varta.load + ". bosch : " + bosch.load);
        varta.exchange(bosch);
        System.out.println("varta : " + varta.load + ". bosch : " + bosch.load);
    }
}
