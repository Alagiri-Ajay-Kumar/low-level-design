package com.atm;

public class FiveHundredDispenser extends CashDispenser {
	public FiveHundredDispenser(CashDispenser nextDispenser) {
	    super(nextDispenser);
	}
	@Override
	public void dispense(int amount) {
		// TODO Auto-generated method stub
		int notes=amount/500;
		int remaining=amount%500;
		
		if(notes>0) System.out.println(notes +" 500 notes are dispensed");
		if(remaining>0) {
		 getNextDispenser().dispense(remaining);}

	}

}
