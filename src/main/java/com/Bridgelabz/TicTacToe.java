package com.Bridgelabz;
import java.util.Scanner;
public class TicTacToe {
    public static char board[] = new char[10];
    public static char PChoice,computerchoice;
    public static Scanner sc = new Scanner(System.in);
    public static void boardcreate() {
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
    public static void printBoard(){
        System.out.println();
        System.out.println("\n " + board[1] + "  | " + board[2] + " | " + board[3] + " ");
        System.out.println(" ----------- ");
        System.out.println("  " + board[4] + " | " + board[5] + " | " + board[6] + " ");
        System.out.println(" ----------- ");
        System.out.println("  " + board[7] + " | " + board[8] + " | " + board[9] + " \n");
    }


    public static void main(String[] args) {
        System.out.println("Welocme to TicTacToe");
        boardcreate();
        options();
        printBoard();

    }
}
