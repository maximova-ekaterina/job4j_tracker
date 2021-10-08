package ru.job4j.tracker;

public class Surgeon extends Doctor {
    String bodyPart;
    String diagnosis;

    public Surgeon(String part, String diagnosis, String patient){
        super(patient);

        this.bodyPart = part;
        this.diagnosis = diagnosis;

    }

    public void diagnose() {
        System.out.println("Диагноз: " + diagnosis + " " + bodyPart);
    }

}
