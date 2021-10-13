package ru.job4j.tracker;

public class Engineer extends Profession {
    private String project;

    public Engineer(String project, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void printInfo() {
        System.out.println("Разработать " + project);
    }
}
