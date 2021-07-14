package com.epam.izh.rd.oline.game;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class GameLogic {
    static int countOfMatches = 20;
    static int numberOfMoves = 0;
    static int numberOfMatchesTaken;


    public static void computerMove() {
        numberOfMoves++;
        OutputToConsole.declaringAMoveOfComputer();
        ComputerLogic.moveOfComputer();
    }

    public static int inputFromKeyboard() {
        Scanner console = new Scanner(System.in);
        return numberOfMatchesTaken = console.nextInt();
    }


    public static void playersMove() {
        numberOfMoves++;
        OutputToConsole.declaringAMoveOfPlayer();
        int currentNumbersOfMatches = inputFromKeyboard();
            switch (currentNumbersOfMatches) {
                case 1:
                    countOfMatches = countOfMatches - 1;
                    OutputToConsole.declaringACountOfPlayerTakesMatches(currentNumbersOfMatches);
                    OutputToConsole.declaringACountOfLessMatches();
                    numberOfMatchesTaken = 1;
                    break;
                case 2:
                    countOfMatches = countOfMatches - 2;
                    OutputToConsole.declaringACountOfPlayerTakesMatches(currentNumbersOfMatches);
                    OutputToConsole.declaringACountOfLessMatches();
                    numberOfMatchesTaken = 2;
                    break;
                case 3:
                    countOfMatches = countOfMatches - 3;
                    OutputToConsole.declaringACountOfPlayerTakesMatches(currentNumbersOfMatches);
                    OutputToConsole.declaringACountOfLessMatches();
                    numberOfMatchesTaken = 3;
                    break;
                default:
                    OutputToConsole.declaringAWrongNumbersOfMatches();
            }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getCountOfmMatches() {
        return countOfMatches;
    }

    public static void takeMatches(int numberOfMatchesTaken) {
        countOfMatches = countOfMatches - numberOfMatchesTaken;
    }

    public static int getNumberOfMatchesTaken() {
        return numberOfMatchesTaken;
    }
}
