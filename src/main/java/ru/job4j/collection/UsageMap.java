package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> post = new HashMap<>();
        post.put("skoropeda@yandex.ru", "Maksimova Ekaterina");
        post.put("alinka-kotova@mail.ru", "Kotova Alina");
        post.put("alinka-kotova@mail.ru", "Kotova Polina");
        for (Map.Entry<String, String> key : post.entrySet()) {
            System.out.println(key);
        }
    }
}
