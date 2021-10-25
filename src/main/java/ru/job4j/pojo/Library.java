package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book fairyTail = new Book("The little prince", 15);
        Book novel = new Book("War and peace", 1200);
        Book biography = new Book("Jack-If-Custo", 355);
        Book blank = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = fairyTail;
        books[1] = novel;
        books[2] = blank;
        books[3] = biography;
        for (int i = 0; i < books.length; i++) {
            Book cC = books[i];
            System.out.println(cC.getName() + " " + cC.getPageCount());
        }
        System.out.println("Replaced fairyTail and biography");
        books[0] = biography;
        books[3] = fairyTail;
        for (int i = 0; i < books.length; i++) {
            Book cC = books[i];
            System.out.println(cC.getName() + "-" + cC.getPageCount());
        }
        System.out.println("Show empty book");
        for (int i = 0; i < books.length; i++) {
            Book cC = books[i];
            if ("Clean code".equals(cC.getName())) {
                System.out.println(cC.getName() + "-" + cC.getPageCount());
            }
        }
    }
}
