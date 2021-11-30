package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key)
            throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element does not exist");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] animal = new String[]{"Caw", "Dog", "Bird"};
        for (int i = 0; i < animal.length; i++) {
            try {
                System.out.println(indexOf(animal, "Bird"));
            } catch (ElementNotFoundException exc) {
                exc.printStackTrace();
            }
        }
    }
}
