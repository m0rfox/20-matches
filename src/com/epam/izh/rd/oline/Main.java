package com.epam.izh.rd.oline;

import com.epam.izh.rd.oline.game.GameLogic;
import com.epam.izh.rd.oline.game.OutputToConsole;

public class Main {

    public static void main(String[] args) {
        OutputToConsole.startOfGame();
        for (int i = 20; i > 1; i--){
            GameLogic.computerMove();
            if (GameLogic.getCountOfmMatches() == 1 ){
                OutputToConsole.endOfGame();
                break;
            }
            GameLogic.playersMove();
            if (GameLogic.getNumberOfMatchesTaken() >3){
                GameLogic.playersMove();
            }
        }
    }
}