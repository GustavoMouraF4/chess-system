package br.com.system.chess.boardgame;

public class Rook extends ChessPiece{

  public Rook(Board board, ChessColor chessColor) {
    super(board, chessColor);
  }

  @Override
  public String toString() {
    return "R";
  }
}
