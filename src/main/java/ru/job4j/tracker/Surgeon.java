package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String bodyPart;
    private String diagnosis;

    public Surgeon(String part, String diagnosis, String patient, String name, String surname, String education, String birthday) {
        super(patient, name, surname, education, birthday);
        this.bodyPart = part;
        this.diagnosis = diagnosis;
    }

    public Surgeon(String body, String d, String p) {
        super(p);
        this.bodyPart = body;
        this.diagnosis = d;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public void diagnose() {
        System.out.println("Диагноз: " + diagnosis + " " + bodyPart);
    }

}
