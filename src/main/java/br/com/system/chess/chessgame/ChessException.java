package br.com.system.chess.chessgame;

import br.com.system.chess.boardgame.BoardException;

public class ChessException extends BoardException {

    public ChessException(String message) {
        super(message);
    }
}
