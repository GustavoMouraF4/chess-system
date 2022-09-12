package br.com.system.chess.boardgame;

public class Piece {

  protected Position position;
  protected Board board;

  public Piece(Board board) {
    this.board = board;
    position = null;
  }

  protected Board getBoard() {
    return board;
  }

  public boolean[][] possibleMoves() {
    return null;
  }

  public boolean possibleMove(Position position) {
    return true;
  }

  public boolean isThereAnyPossibleMove() {
    return true;
  }
}
