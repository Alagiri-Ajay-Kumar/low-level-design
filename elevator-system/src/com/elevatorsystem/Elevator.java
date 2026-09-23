package com.elevatorsystem;

import java.util.*;

public class Elevator {
private int id;
private int currentFloor;
private ElevatorState state;

private Queue<Request> requests = new LinkedList<>();


public Elevator() {
	super();
}
public Elevator(int id) {
	super();
	this.id = id;
	this.state=ElevatorState.IDLE;
	this.currentFloor=0;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCurrentFloor() {
	return currentFloor;
}
public void setCurrentFloor(int currentFloor) {
	this.currentFloor = currentFloor;
}
public ElevatorState getState() {
	return state;
}
public void setState(ElevatorState state) {
	this.state = state;
}


public void processRequest()
{
	while(!requests.isEmpty()) {
	Request request=requests.poll();
	
	//Move to source floor
	moveTo(request.getFloorRequest().getCurrentFloor());
	//Stop and open Door and close door
	operateDoor();
	//Move to Destination floor
	moveTo(request.getCabinRequest().getDestinationFloor());
	//Stop, open and close door
	operateDoor();}
	setState(ElevatorState.IDLE);
	
	
}
public void moveTo(int target)
{
	while(currentFloor!=target)
	{
		if(currentFloor<target)
		{
			setState(ElevatorState.MOVING_UP);
			currentFloor++;
        }
		else 
		{
			setState(ElevatorState.MOVING_DOWN);
			currentFloor--;
		}
	}
	System.out.println("Elevator "+ id + " has reached the floor "+currentFloor);
	
}
public void operateDoor()
{
	System.out.println("Opening door of Elevator "+id+" at floor "+currentFloor);
	
	
	try {
	    Thread.sleep(5000); // waits for 5 secondsS
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("Closing door of Elevator "+id+" at floor "+currentFloor);
}
public void addRequest(Request request)
{
	requests.offer(request);
}



}
