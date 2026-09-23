package com.elevatorsystem;

import java.util.*;


public class ElevatorSystem {

	private ElevatorScheduler scheduler;
	private List<Elevator> elevators;
	
	public ElevatorSystem(int count,ElevatorScheduler scheduler)
	{
		this.scheduler=scheduler;
		this.elevators=new ArrayList<>();
		for(int i=0;i<count;i++)
		{
			
			Elevator elevator=new Elevator(i+1);
			elevators.add(elevator);
		}
	}
	public void assignRequest(int source,int destination)
	{
		Direction direction=null;
		if(source>destination)
		{
			direction=Direction.DOWN;
		}
		else 
			direction=Direction.UP;
		Request request=new Request(new FloorRequest(source,direction),new CabinRequest(destination));
		Elevator elevator=scheduler.assignElevator(request, elevators);
		elevator.addRequest(request);
		elevator.processRequest();
		
	}
	
	
	
}
