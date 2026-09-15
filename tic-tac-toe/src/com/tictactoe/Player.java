package com.tictactoe;

import java.util.UUID;

public class Player {
private String id;
private String name;
private Symbol symbol;
public Player(String name, Symbol symbol) {
	super();
	this.name = name;
	this.symbol = symbol;
	id=UUID.randomUUID().toString();
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public Symbol getSymbol() {
	return symbol;
}




}
