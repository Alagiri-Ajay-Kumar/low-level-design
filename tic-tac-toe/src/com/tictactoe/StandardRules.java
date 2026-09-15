package com.tictactoe;

public class StandardRules implements Rules {



	@Override
	public boolean isWin(Board board, Symbol S) {
		// TODO Auto-generated method stub
		Symbol[][] grid=board.getBoard();
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid.length;j++)
			{
				if(grid[i][j]==S && j==grid.length-1)
				{
					return true;
				}
				if(grid[i][j]!=S) break;
			}
		}
		for(int j=0;j<grid.length;j++)
		{
			for(int i=0;i<grid.length;i++)
			{
				if(grid[i][j]==S && i==grid.length-1)
				{
					return true;
				}
				if(grid[i][j]!=S) break;
			}
		}
		
		return false;
	}

	@Override
	public boolean isDraw(Board board) {
		// TODO Auto-generated method stub
		Symbol[][] grid=board.getBoard();
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid.length;j++) {
				if(grid[i][j]==Symbol.E) return false;
			}
		}
		return true;
	}

	@Override
	public boolean isValidMove(Board board, int row, int col) {
		// TODO Auto-generated method stub
		
		Symbol[][] grid=board.getBoard();
		if(row>=grid.length || col>=grid.length )
		{
			return false;
		}
		if(grid[row][col]==Symbol.E) return true;
		return false;
	}

}
