package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int i = indexOf(id);
        return i != -1 ? items[i] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemName = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                    itemName[count] = item;
                    count++;
            }
        }
        return Arrays.copyOf(itemName, count);
    }

    public boolean replace(int id, Item item) {
        int i = indexOf(id);
        item.setId(id);
        items[i] = item;
        return i != -1 ? true : false;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        items[indexOf(id)] = null;
        items[size - 1] = null;
        for(int i = 0; i < size; i++) {
            int start = i + 1;
            int distPos = i;
            int length = size - i - 1;
            size--;
            System.arraycopy(items, start, items, distPos, length);
        }
        return id != -1 ? true : false;
    }
}