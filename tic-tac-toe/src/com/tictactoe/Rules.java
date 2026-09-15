package com.tictactoe;

public interface Rules {
boolean isWin(Board board,Symbol S);
boolean isDraw(Board board);
boolean isValidMove(Board board,int row, int col);
}
