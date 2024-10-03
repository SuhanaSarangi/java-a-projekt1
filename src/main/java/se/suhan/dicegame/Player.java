package se.suhan.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public void playDiceGame(Player opponent) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        for (int round = 1; round <= 2; round++) {
            //sc.nextLine();
            System.out.println("Click ENTER to start Round " + round + "..");
            sc.nextLine();

            // player1 rolls the dice
            int player1Roll = rand.nextInt(6) + 1;
            System.out.println(this.name + " rolls: " + player1Roll);
            this.addScore(player1Roll);

            // player2 rolls the dice
            int player2Roll = rand.nextInt(6) + 1;
            System.out.println(opponent.getName() + " rolls: " + player2Roll);
            opponent.addScore(player2Roll);
        }
    }
}
