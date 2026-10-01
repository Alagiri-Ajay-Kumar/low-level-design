package com.atm;

import java.util.*;

public class HasCardState implements ATMState {
     private ATMMachine machine;
     private boolean pinVerified=false;
     
     
	public HasCardState(ATMMachine machine) {
		super();
		this.machine = machine;
		
	}

	@Override
	public void insertCard(Card card) {
		// TODO Auto-generated method stub
 
	}

	@Override
	public boolean enterPin(int pin) {
		// TODO Auto-generated method stub
		if(pin==machine.getCard().getPin())
		{
			System.out.println("Pin entered successfully");
			  pinVerified=true;
		}
		else
		{
			System.out.println(" In correct  please collect your card and retry with correct  PIN ");
			
		}
		
		return pinVerified;

	}

	@Override
	public void selectAmount(int amount) {
		// TODO Auto-generated method stub
       if(pinVerified)
       {
    	   machine.setAmount(amount);
    	   machine.setState(new DispenseState(machine));
    	   
       }
       else 
       {
    	   System.out.println("Enter the correct pin ");
       }
	}

	@Override
	public void dispenseCash() {
		// TODO Auto-generated method stub

	}

}
