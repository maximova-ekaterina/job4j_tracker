package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                for (int j = i + 1; j < products.length; j++) {
                    products[j - 1] = products [j];
                }
                products[products.length-1] = null;
                break;
            }
        }
            return products;
    }
}
