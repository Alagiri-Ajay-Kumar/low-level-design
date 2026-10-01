package com.atm;

public interface ATMState {
	void insertCard(Card card);
	boolean enterPin(int pin);
	void selectAmount(int amount);
	void dispenseCash();

}
