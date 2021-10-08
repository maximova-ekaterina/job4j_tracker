package ru.job4j.tracker;

public class Dentist extends Doctor {
    int tooth;

    public Dentist(int tooth, String patient) {
        super(patient);

        this.tooth = tooth;
    }

    public void therapy() {
        System.out.println("Зуб номер " + tooth + " нужается в лечении");
    }
}
