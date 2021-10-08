package ru.job4j.tracker;

public class Builder extends Engineer {
    String plan;

    public Builder(String plan, String project) {
        super(project);

        this.plan = plan;
    }

    void build() {
        System.out.println("Создать " + plan + " " + project);
    }
}
