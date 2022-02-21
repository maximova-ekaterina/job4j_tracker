package ru.job4j.collection;

import java.util.*;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task lists : list) {
            for (Task li : list) {
                if (lists.equals(li)) {
                    numbers.add(li.getNumber());
                }
            }
        }
        return numbers;
    }
}
