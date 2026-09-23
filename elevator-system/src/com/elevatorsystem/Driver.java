package com.elevatorsystem;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ElevatorSystem elevatorSystem=new ElevatorSystem(4,new NearestElevatorStrategy());
     elevatorSystem.assignRequest(2, 10);
     elevatorSystem.assignRequest(3, 5);
     elevatorSystem.assignRequest(2, 4);
     elevatorSystem.assignRequest(0, 6);
     
	}

}
