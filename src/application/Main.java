package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch c1 = new ChessMatch();
        UI.printBoard(c1.getPieces());


    }
}