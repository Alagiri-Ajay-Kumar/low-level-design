package com.atm;

public class CashDispenserSystem {
     private FiveHundredDispenser fiveHundred;
	public CashDispenserSystem()
	{
		CashDispenser hundred=new HundredDispenser(null);
		CashDispenser twoHundred=new TwoHundredDispenser(hundred);
	    fiveHundred=new FiveHundredDispenser(twoHundred);	
	}
	
	public boolean canDispense(int amount)
	{
		return amount > 0 && amount % 100 == 0;
	}
	public void dispense(int amount)
	{
		if(canDispense(amount))
		{
			fiveHundred.dispense(amount);
		}
		else
			System.out.println("Enter a positive amount in multiples of ₹100 available denominations are 500, 200 and 100");
		
	}
	
}
