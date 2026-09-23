package com.elevatorsystem;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorScheduler {

	@Override
	public Elevator assignElevator(Request request, List<Elevator> elevators) {
		// TODO Auto-generated method stub
		Elevator elevator=null;
		int difference=1000;
		int requestedFloor=request.getFloorRequest().getCurrentFloor();
		for(Elevator e : elevators)
		{
			if(Math.abs(requestedFloor-e.getCurrentFloor())<difference)
					{
				     elevator =e;
				     difference=Math.abs(requestedFloor-e.getCurrentFloor());
					}
		}
		System.out.println("Elevator "+elevator.getId()+" is assigned  for you");
		
		return elevator;
		}

}
