package com.epam.izh.rd.oline.game;

import static com.epam.izh.rd.oline.game.GameLogic.*;
import static com.epam.izh.rd.oline.game.OutputToConsole.declaringACountOfComputerTakesMatches;


public class ComputerLogic {

    public static void moveOfComputer(){
        if (numberOfMoves == 1){
            takeMatches(3);
            numberOfMatchesTaken = 3;
            OutputToConsole.declaringACountOfComputerTakesMatches();
            OutputToConsole.declaringACountOfLessMatches();
        }else {
        switch (numberOfMatchesTaken) {
            case 1:
                takeMatches(3);
                numberOfMatchesTaken = 3;
                OutputToConsole.declaringACountOfComputerTakesMatches();
                OutputToConsole.declaringACountOfLessMatches();
                break;
            case 2:
                takeMatches(2);
                numberOfMatchesTaken = 2;
                OutputToConsole.declaringACountOfComputerTakesMatches();
                OutputToConsole.declaringACountOfLessMatches();
                break;
            case 3:
                takeMatches(1);
                numberOfMatchesTaken = 1;
                OutputToConsole.declaringACountOfComputerTakesMatches();
                OutputToConsole.declaringACountOfLessMatches();
                break;
        }
        }
    }
}
