/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess.Piece;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;

/**
 *
 * @author Ruan
 */
public class King extends ChessPiece{
        
    public King(Board board, Color color) {
        super(board, color);
    }
        
    
    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
