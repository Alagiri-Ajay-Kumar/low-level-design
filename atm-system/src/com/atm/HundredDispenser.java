package com.atm;

public class HundredDispenser extends CashDispenser {
	public HundredDispenser(CashDispenser nextDispenser) {
	    super(nextDispenser);
	}
	@Override
	public void dispense(int amount) {
		// TODO Auto-generated method stub
		int notes=amount/100;
		int remaining=amount%100;
		
		if(notes>0) System.out.println(notes +" 100 notes are dispensed");
		if(remaining>0) {
		 getNextDispenser().dispense(remaining);}
	}

}
