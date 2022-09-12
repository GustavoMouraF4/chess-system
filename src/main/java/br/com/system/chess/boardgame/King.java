package br.com.system.chess.boardgame;

public class King extends ChessPiece{

  public King(Board board, ChessColor chessColor) {
    super(board, chessColor);
  }

  @Override
  public String toString() {
    return "K";
  }
}
