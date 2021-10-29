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
        if (i != -1) {
            items[i] = item;
            items[i].setId(id);
        }
        return i != -1;
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
        int rsl = indexOf(id);
        items[size - 1] = null;
        if (rsl != -1) {
            System.arraycopy(items, rsl + 1, items, rsl, size - rsl);
            size--;
        }
        return rsl != -1;
    }
}