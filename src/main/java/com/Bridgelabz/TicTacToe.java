package com.Bridgelabz;
import java.util.Scanner;

public class TicTacToe {
    public static char PChoice,computerchoice;
    public static Scanner sc = new Scanner(System.in);


    public static void boardcreate() {
        char board[] = new char[10];
        for (int i = 1; i < board.length; i++) {
              board[i] = ' ';
            }
        }


    public static void options() {
        System.out.println("\nEnter the 'X' or 'O' what you needed:");
        PChoice = sc.next().charAt(0);
        if (PChoice == 'x' || PChoice == 'o') {
        }
        else {
            System.out.println("\nYou chose wrong one!!!");
            options();
        }
        if(PChoice == 'x' )
            computerchoice= 'o';
        else if(PChoice == 'X')
            computerchoice = 'O';
        else if(PChoice == 'o' )
            computerchoice= 'x';
        else
            computerchoice = 'X';
        System.out.println("You chose " + PChoice+" \n");
        System.out.println("Computer is " + computerchoice+" \n");
    }


    public static void main(String[] args) {

        System.out.println("Welocme to TicTacToe");
        boardcreate();
        options();

    }
}
