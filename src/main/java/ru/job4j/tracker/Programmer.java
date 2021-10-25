package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String language, String project, String name,
                      String surname, String education, String birthday) {
        super(project, name, surname, education, birthday);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    void write() {
        System.out.println("Написать " + getProject() + " на языке " + language);
    }
}
