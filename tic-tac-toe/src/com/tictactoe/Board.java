package com.tictactoe;

public class Board {
 
private int size;
private Symbol[][] board;

public Board(int size) {
	super();
	this.size = size;
	this.board = new Symbol[size][size];
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			board[i][j]=Symbol.E;
		}
	}
}
public Symbol[][] getBoard() {
	return board;
}
public void setBoard(Symbol[][] board) {
	this.board = board;
}
public boolean isEmpty( int row, int col)
{
	int n=board.length;
	if((row<n && col<n) && board[row][col]==Symbol.E) return true;
	return false;
}
public Symbol displayCell(int row ,int col)
{
	if(row>=board.length || col>=board.length )
	{
		throw new IllegalStateException("the row and col are out of bounds");
	}
	
	return board[row][col];
}
public void setCell(int row ,int col,Symbol s) {
	board[row][col]=s;
}
public void displayBoard()
{
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board.length;j++)
		{
			System.out.print(board[i][j]+" ");
		}
		System.out.println(" ");
	}
}
	
	
}
