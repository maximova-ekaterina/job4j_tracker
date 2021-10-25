package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("Дата и время до форматирования: " + item.getCreated());

        DateTimeFormatter restyle = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String sample = item.getCreated().format(restyle);
        System.out.println("Дата и время после форматирования: " + sample);
    }
}
