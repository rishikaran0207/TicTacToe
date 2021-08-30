package com.Bridgelabz;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welocme to TicTacToe");
    }

    public static void boardcreate() {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }

        }
    }
}


