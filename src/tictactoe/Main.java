package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new TicTacToeController(new Scanner(System.in)).run();
    }
}
