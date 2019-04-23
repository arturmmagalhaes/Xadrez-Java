package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Xadrez.ChessException;
import Xadrez.ChessMatch;
import Xadrez.ChessPiece;
import Xadrez.ChessPosition;
import tabuleiro.Board;
import tabuleiro.Position;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
	
		while(true) {
			try {
				UI.cleanScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
			
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
			
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}