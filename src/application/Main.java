/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import bordgame.Position;
import bordgame.Board;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        while(true){
           try{ 
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(ler);
                
                boolean [][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(ler);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }catch(ChessException e){
                System.out.println(e.getMessage());
                ler.nextLine();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                ler.nextLine();
            }
        }
        
    }
}
