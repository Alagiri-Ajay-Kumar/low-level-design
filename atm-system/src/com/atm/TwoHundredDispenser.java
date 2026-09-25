package com.atm;

public class TwoHundredDispenser extends CashDispenser {
	public TwoHundredDispenser(CashDispenser nextDispenser) {
	    super(nextDispenser);
	}
	@Override
	public void dispense(int amount) {
		// TODO Auto-generated method stub
		int notes=amount/200;
		int remaining=amount%200;
		
		if(notes>0) System.out.println(notes +" 200 notes are dispensed");
		if(remaining>0) {
		 getNextDispenser().dispense(remaining);}
	}

}
