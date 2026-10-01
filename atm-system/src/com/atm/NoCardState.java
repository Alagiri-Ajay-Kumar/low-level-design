package com.atm;

public class NoCardState implements ATMState {
	private ATMMachine machine;
	
	
    public NoCardState(ATMMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertCard(Card card) {
		// TODO Auto-generated method stub
		System.out.println("Card inserted  ");
		machine.setCard(card);
		machine.setState(new HasCardState(machine));

	}

	@Override
	public boolean enterPin(int pin) {
		// TODO Auto-generated method stub
		return false;

	}

	@Override
	public void selectAmount(int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispenseCash() {
		// TODO Auto-generated method stub

	}

}
