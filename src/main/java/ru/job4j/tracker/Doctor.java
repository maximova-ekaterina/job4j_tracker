package ru.job4j.tracker;

public class Doctor extends Profession {
    private String patient;

    public Doctor(String patient, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.patient = patient;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    void reception() {
        System.out.println("Прием пациента. Пациент " + patient);
    }
}
