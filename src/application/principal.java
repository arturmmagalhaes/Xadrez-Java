package application;

import Xadrez.ChessMatch;
import tabuleiro.Board;
import tabuleiro.Position;

public class Principal {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
