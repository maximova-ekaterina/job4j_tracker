package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First player" : "Second player";
            System.out.println(player + " enter the number from 1 to 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
                count = count - matches;
                System.out.println("Remaining matches: " + count);
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("The winner is the first player. Congratulations!");
        } else {
            System.out.println("The winner is the second player. Congratulations!");
        }
        input.close();
    }
}

