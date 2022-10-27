package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    // Somente o get para a cor da peça não ser alterada
    public Color getColor() {
        return color;
    }


}

