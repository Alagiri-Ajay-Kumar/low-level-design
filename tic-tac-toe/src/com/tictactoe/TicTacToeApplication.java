package com.tictactoe;

public class TicTacToeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board =new Board(3);
		Player pl1=new Player("Ajay",Symbol.O);
		Player pl2=new Player("Rohit",Symbol.X);
		StandardRules rules=new StandardRules();
		
		Game game=new Game(board,rules);
		game.addPlayer(pl1);
		game.addPlayer(pl2);
		
		game.play();
		

	}

}
