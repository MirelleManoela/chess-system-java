package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }


    // Somente classes do mesmo pacote e subclasses podem acessar o tabuleiro de uma peça
    protected Board getBoard() {
        return board;
    }


}
