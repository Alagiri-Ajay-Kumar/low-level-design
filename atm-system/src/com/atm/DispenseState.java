package com.atm;

public class DispenseState implements ATMState {
    private ATMMachine machine;
    private CashDispenserSystem system;
    
	public DispenseState(ATMMachine machine) {
		super();
		this.machine = machine;
		system=new CashDispenserSystem();
	}

	@Override
	public void insertCard(Card card) {
		// TODO Auto-generated method stub

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
		system.dispense(machine.getAmount());
		
		System.out.println("Please collect your card");
		machine.setAmount(0);
		machine.setCard(null);
		
		machine.setState(new NoCardState(machine));

	}

}
