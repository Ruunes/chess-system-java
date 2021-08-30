/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess.Piece;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;
import bordgame.Position;

/**
 *
 * @author Ruan
 */
public class Rock extends ChessPiece{
    
    public Rock(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
        
        // above
        p.setValues(position.getRow()-1, position.getColumn());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() -1);
        }
        
        if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // left
        p.setValues(position.getRow(), position.getColumn() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getColumn()- 1);
        }
        
        if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // right
        p.setValues(position.getRow(), position.getColumn() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getColumn()+ 1);
        }
        
        if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        // below
        p.setValues(position.getRow() + 1, position.getColumn());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        
        if(getBoard().positionExists(p) && isThereOppnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        return mat;
    }
}
