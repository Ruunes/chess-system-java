/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Chess.ChessMatch;
import bordgame.Position;
import bordgame.Board;

/**
 *
 * @author Ruan
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
}
