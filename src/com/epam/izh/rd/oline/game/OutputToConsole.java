package com.epam.izh.rd.oline.game;


import static com.epam.izh.rd.oline.game.GameLogic.numberOfMatchesTaken;

public class OutputToConsole {

    public static void printSeparator(){
        System.out.println("-------------------------------------------------------");
    }

    public static void printStartEndSeparator(){
        System.out.println("*******************************************************");
    }

    public static void startOfGame(){
        printStartEndSeparator();
        System.out.println("******************* Игра началась! ********************");
        printStartEndSeparator();
    }

    public static void endOfGame (){
        printStartEndSeparator();
        System.out.println("************ Игра окончилась, вы проиграли! ***********");
        printStartEndSeparator();

    }

    public static void declaringAMoveOfComputer (){
        System.out.println("Ход компьютера...");
        printSeparator();
    }
    public static void declaringAMoveOfPlayer (){
        System.out.println("Ваш ход, введите число от 1 до 3:");
        printSeparator();
    }


    public static void declaringAWrongNumbersOfMatches (){
        System.out.println("Вы взяли недопустимое число спичек, возьмите от одной до трех спичек.");
        printSeparator();
    }

    public static void declaringAWrongSymbol (){
        System.out.println("Вы ввели недопустимый символ!");
        printSeparator();
    }

    public static void declaringACountOfComputerTakesMatches (){
        if (numberOfMatchesTaken == 1){
            System.out.print("Компьютер забрал " + numberOfMatchesTaken + " спичку. ");
        }else{
            System.out.print("Компьютер забрал " + numberOfMatchesTaken + " спички. ");
        }
    }


    public static void declaringACountOfPlayerTakesMatches (int currentNumbersOfMatches){
        if (currentNumbersOfMatches == 1){
            System.out.print("Вы забрали " + currentNumbersOfMatches + " спичку. ");
        }else {
            System.out.print("Вы забрали " + currentNumbersOfMatches + " спички. ");
        }
    }

    public static void declaringACountOfLessMatches(){
        if (GameLogic.getCountOfmMatches() == 1){
            System.out.println("На столе осталась " + GameLogic.getCountOfmMatches() + " спичка. ");
            printSeparator();
        }else if (GameLogic.getCountOfmMatches() == 2 ^ GameLogic.getCountOfmMatches() == 3 ^ GameLogic.getCountOfmMatches() == 4){
            System.out.println("На столе осталось " + GameLogic.getCountOfmMatches() + " спички. ");
            printSeparator();
        } else{
            System.out.println("На столе осталось " + GameLogic.getCountOfmMatches() + " спичек. ");
            printSeparator();
        }
    }


}
