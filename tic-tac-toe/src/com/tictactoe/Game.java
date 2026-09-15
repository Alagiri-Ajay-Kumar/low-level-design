package com.tictactoe;


import java.util.*;

public class Game {
private Board board;
private Rules rules;
Queue<Player> queue =new LinkedList<>();
private boolean gameOver=false;
public Game(Board board, Rules rules) {
	super();
	this.board = board;
	this.rules = rules;
}


public void addPlayer(Player player)
{
	queue.add(player);
}
public void play()
{
	Scanner sc = new Scanner(System.in);
	while(!gameOver)
	{
		board.displayBoard();
        Player curr=queue.poll();
        System.out.println(curr.getName()+" Symbol"+curr.getSymbol()+" turn select row and column ");
        
        int row=sc.nextInt();
        int col=sc.nextInt();
        
        
        
        if(rules.isValidMove(board, row, col))
        {
        	board.setCell(row, col, curr.getSymbol());
        	if(rules.isWin(board, curr.getSymbol()) || rules.isDraw(board))
        	{
        		gameOver=true;
        		if(rules.isWin(board, curr.getSymbol()))
        			System.out.println(curr.getName()+" wins the game");
        		else 
        			System.out.println("The game is draw");
        	}
        	else
        	{
        		queue.add(curr);
        	}
        	
        }
        else {
        	System.out.println("Invalid move please try some other row and col");
        	queue.add(curr);
        }
    



	}
	
	
	
	
	
	
	
	
}


}
