package br.com.system.chess.boardgame;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Position {

  private int row;
  private int column;

  public Position(int row, int column) {
    this.row = row;
    this.column = column;
  }

  @Override
  public String toString() {
    return this.row + ", " + this.column;
  }
}
