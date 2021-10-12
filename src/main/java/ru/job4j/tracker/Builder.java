package ru.job4j.tracker;

public class Builder extends Engineer {
    private String plan;

    public Builder(String plan, String project, String name, String surname, String education, String birthday) {
        super(project, name, surname, education, birthday);
        this.plan = plan;
    }

    public Builder(String pl, String proj) {
        super(proj);
        this.plan = pl;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    void build() {
        System.out.println("Создать " + plan + " " + getProject());
    }
}
