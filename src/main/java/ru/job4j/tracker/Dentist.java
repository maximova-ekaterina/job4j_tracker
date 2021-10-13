package ru.job4j.tracker;

public class Dentist extends Doctor {
    private int tooth;

    public Dentist(int tooth, String patient, String name, String surname, String education, String birthday) {
        super(patient, name, surname, education, birthday);
        this.tooth = tooth;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

    public void therapy() {
        System.out.println("Зуб номер " + tooth + " нужается в лечении");
    }
}
