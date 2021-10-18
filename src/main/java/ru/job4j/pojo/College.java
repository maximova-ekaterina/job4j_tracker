package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Rainhold Messner");
        student.setGroup("Ecology");
        student.setDateOfAdmission("30/09/2015");

        System.out.println(student.getFio() + " зачислен в группу "
                + student.getGroup() + ". Дата поступления " + student.getDateOfAdmission());
    }
}
