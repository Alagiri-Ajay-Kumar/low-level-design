package com.atm;

import java.util.*;

public class Card {
private String id;
private String name;
private int pin;
public Card(String name, int pin) {
	super();
	this.id=UUID.randomUUID().toString();
	this.name = name;
	this.pin = pin;
}
public String getName() {
	return name;
}

public int getPin() {
	return pin;
}

}
