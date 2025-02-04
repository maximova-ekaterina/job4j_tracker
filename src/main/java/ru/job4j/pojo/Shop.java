package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        int rsl = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bred", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
        Product product = products[i];
        if (product != null) {
            System.out.println(product.getName());
            }
        }
    }
}
