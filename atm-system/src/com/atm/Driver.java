package com.atm;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATMMachine machine=new ATMMachine();
		Card card=new Card("Ajay ",1234);
		
		System.out.println("Please enter your card ");
		machine.insertCard(card);
		
		System.out.println("Please enter your pin ");
		Scanner scanner=new Scanner(System.in);
		
		int pin=scanner.nextInt();
		
		
		if(machine.enterPin(pin))
		{
			System.out.println("Enter the amount ");
			int amount=scanner.nextInt();
			machine.selectAmount(amount);
			machine.dispenseCash();
		}
		
		
		
		
		
		
		
		
		


	}

}
