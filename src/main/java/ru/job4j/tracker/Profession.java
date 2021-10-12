package ru.job4j.tracker;

import javax.print.Doc;

public class Profession {
     private String name;
     private String surname;
     private String education;
     private String birthday;

     public Profession(String name, String surname, String education, String birthday) {
         this.name = name;
         this.surname = surname;
         this.education = education;
         this.birthday = birthday;
     }

     public Profession() {
     }

     public String getName() {
         return name;
     }

     public String getSurname() {
         return surname;
     }

     public String getEducation() {
         return education;
     }

     public String getBirthday() {
         return birthday;
     }

     public void setName(String n) {
         name = n;
     }

     public void setSurname(String s) {
         surname = s;
     }

     public void setEducation(String e) {
         education = e;
     }

     public void setBirthday(String b) {
         birthday = b;
     }

     void showPrint() {
         System.out.println("Имя и фамилия: " + name + " " + surname);
         System.out.println("Образование: " + education);
         System.out.println("День рождения: " + birthday);
     }

     public static void main(String[]args) {
     }
}
