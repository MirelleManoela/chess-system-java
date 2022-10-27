package chess;

import boardgame.Board;
import boardgame.Position;
import chessPieces.King;
import chessPieces.Rook;

public class ChessMatch {

    // Classe onde ficam as regras do jogo

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        //Chamando o inicio do jogo
        initialSetup();
    }

    // Metodo que retorna uma matriz de peças de xadrez
    public ChessPiece[][] getPieces(){
        ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    //Responsavel por iniciar a partida colocando as peças no tabuleiro
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), (new Position(2,1)));
        board.placePiece(new King(board, Color.BLACK), new Position(0,4));
        board.placePiece(new King(board, Color.WHITE), new Position(7,4));
    }
}
