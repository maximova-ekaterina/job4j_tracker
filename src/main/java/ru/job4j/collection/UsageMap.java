package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> post = new HashMap<>();
        post.put("skoropeda@yandex.ru", "Maksimova Ekaterina");
        post.put("alinka-kotova@mail.ru", "Kotova Alina");
        for (String key : post.keySet()) {
            System.out.println(key);
        }
    }
}
