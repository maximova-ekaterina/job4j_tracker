package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Маршрут №1.");

    }

    @Override
    public void passengers(int numbers) {
        System.out.println("Количество пассажиров: " + numbers);

    }

    @Override
    public int refuel(int fuel) {
        int liter = 2;
        int cost = liter * fuel;
        return cost;
    }
}
