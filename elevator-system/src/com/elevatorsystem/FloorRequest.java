package com.elevatorsystem;

public class FloorRequest {
private int currentFloor;
private Direction directon;
public int getCurrentFloor() {
	return currentFloor;
}

public FloorRequest(int currentFloor, Direction directon) {
	super();
	this.currentFloor = currentFloor;
	this.directon = directon;
}

public void setCurrentFloor(int currentFloor) {
	this.currentFloor = currentFloor;
}
public Direction getDirecton() {
	return directon;
}
public void setDirecton(Direction directon) {
	this.directon = directon;
}



}
