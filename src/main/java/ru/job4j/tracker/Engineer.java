package ru.job4j.tracker;

public class Engineer extends Profession {
    String project;

    public Engineer(String project) {

        this.project = project;
    }

    public void printInfo() {
        System.out.println("Разработать " + project);
    }
}
