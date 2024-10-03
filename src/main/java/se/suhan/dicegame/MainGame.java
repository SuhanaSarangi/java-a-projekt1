package se.suhan.dicegame;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("WELCOME TO THE DICE GAME!");
        System.out.println("Click ENTER to read the rules..");

        // Rules
        scanner.nextLine();
        System.out.println("Rule1: Two players compete against each other.");
        System.out.println("Rule2: Players take turns twice rolling a die.");
        System.out.println("Rule3: The player with the highest total score wins.");
        System.out.println("Click ENTER to proceed..");
        scanner.nextLine();

        // Get player names
        System.out.print("Enter name for Player1: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Enter name for Player2: ");
        Player player2 = new Player(scanner.nextLine());

        // Play the game
        player1.playDiceGame(player2);
        scanner.nextLine();

        // Display the final scores
        System.out.println("Click ENTER to see the final scores..");
        scanner.nextLine();
        System.out.println(player1.getName() + "'s total score: " + player1.getScore());
        System.out.println(player2.getName() + "'s total score: " + player2.getScore());
        scanner.nextLine();

        // Declare the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println("YAY! " + player1.getName() + " is the WINNER!!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("YAY! " + player2.getName() + " is the WINNER!!");
        } else {
            System.out.println("So it's a TIE!");
        }

        scanner.close();
    }
}

