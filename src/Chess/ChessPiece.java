/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

import bordgame.Board;
import bordgame.Piece;
import bordgame.Position;

/**
 *
 * @author Ruan
 */
public abstract class ChessPiece extends Piece{

    private Color color;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
     protected boolean isThereOppnentPiece(Position position){
         ChessPiece p = (ChessPiece) getBoard().piece(position);
         return p != null && p.getColor() != color;
     }
}
