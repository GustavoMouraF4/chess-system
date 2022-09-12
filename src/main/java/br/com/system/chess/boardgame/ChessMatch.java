package br.com.system.chess.boardgame;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChessMatch {

  private Board board;

  public ChessMatch() {
    this.board = new Board(8, 8);
    initialSetup();
  }

  public ChessPiece[][] getPieces() {
    ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
    for (int i = 0; i < board.getRows(); i++) {
      for (int j = 0; j < board.getColumns(); i++) {
        mat[i][j] = (ChessPiece) board.piece(i, j);
      }
    }

    return mat;
  }

  private void initialSetup() {
    board.placePiece(new Rook(board, ChessColor.BLACK), new Position(2,1));
    board.placePiece(new King(board, ChessColor.BLACK), new Position(0,4));
    board.placePiece(new King(board, ChessColor.WHITE), new Position(5,1));
    board.placePiece(new King(board, ChessColor.WHITE), new Position(7,4));
  }
}
