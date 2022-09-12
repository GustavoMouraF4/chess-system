package br.com.system.chess.boardgame;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChessPiece extends Piece{

  public ChessPiece(Board board, ChessColor chessColor) {
    super(board);
    this.chessColor = chessColor;
  }

  private ChessColor chessColor;
  private int moveCount;

  public ChessPosition getChessPosition() {
    return null;
  }

  @Override
  public boolean isThereAnyPossibleMove() {
    return true;
  }

  public void incrementMoveCount() {
    this.moveCount++;
  }

  public void decreaseMoveCount() {
    this.moveCount--;
  }

}
