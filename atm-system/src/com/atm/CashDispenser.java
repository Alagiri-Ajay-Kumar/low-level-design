package com.atm;

public abstract class CashDispenser {

	private CashDispenser nextDispenser;
	
	public CashDispenser() {
		super();
	}

    public CashDispenser(CashDispenser nextDispenser) {
		super();
		this.nextDispenser = nextDispenser;
	}



	public CashDispenser getNextDispenser() {
		return nextDispenser;
	}


   public abstract void dispense(int amount);
	
	
	
	
	
	
}
