package ru.job4j.tracker;

import javax.print.Doc;

public class Profession {
     private String name;
     private String surname;
     private String education;
     private String birthday;

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
         Doctor doctor = new Doctor("Rainhold Messner");
         Dentist dentist = new Dentist(6, "Rainhold Messner");
         Surgeon surgeon = new Surgeon("руки", "растяжение", "Cathrine Destivelle");
         Engineer engineer = new Engineer("ПО");
         Programmer programmer = new Programmer("Kotlin", "приложение Танчики");
         Builder builder = new Builder("схему", "трубопровода");
         doctor.setName("Айболит");
         doctor.setSurname("Рабинович");
         doctor.setEducation("пластическая хирургия");
         doctor.setBirthday("20 век н.э.");
         doctor.showPrint();
         dentist.reception();
         dentist.therapy();
         surgeon.reception();
         surgeon.diagnose();
         engineer.setName("Ford");
         engineer.showPrint();
         engineer.printInfo();
         programmer.write();
         builder.printInfo();
         builder.build();


     }
}
