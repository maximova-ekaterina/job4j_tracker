package ru.job4j.tracker;

public class Programmer extends Engineer {
    String language;

    public Programmer(String language, String project) {
        super(project);

        this.language = language;
    }

    void write() {
        System.out.println("Написать " + project + " на языке " + language);
    }
}
