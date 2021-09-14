package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Result: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(false, 1, "Correct the error");
        error.print();
        Error notError = new Error(true, 2, "The program works without errors");
        notError.print();
        Error system = new Error();
        system.print();
    }
}
