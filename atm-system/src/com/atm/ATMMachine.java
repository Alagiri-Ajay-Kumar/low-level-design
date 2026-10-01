package com.atm;

public class ATMMachine {
private ATMState state;
private Card card;
private int amount;

public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public Card getCard() {
	return card;
}
public void setCard(Card card) {
	this.card = card;
}
public ATMMachine() {
	super();
	this.state = new NoCardState(this) ;
}
public void insertCard(Card card)
{
 state.insertCard(card);	
}
public boolean enterPin(int pin)
{
	return state.enterPin(pin);
	
}
public void selectAmount(int amount)
{
	state.selectAmount(amount);
}
public void dispenseCash()
{
	state.dispenseCash();}


public ATMState getState() {
	return state;
}
public void setState(ATMState state) {
	this.state = state;
}





}
