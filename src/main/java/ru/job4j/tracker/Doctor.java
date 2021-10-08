package ru.job4j.tracker;

public class Doctor extends Profession {
    String patient;

    public Doctor(String patient) {
        this.patient = patient;
    }

    void reception() {
        System.out.println("Прием пациента. Пациент " + patient);
    }
}
