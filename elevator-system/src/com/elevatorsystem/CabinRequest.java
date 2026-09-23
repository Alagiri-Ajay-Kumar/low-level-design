package com.elevatorsystem;

public class CabinRequest {
private int destinationFloor;

public CabinRequest(int destinationFloor) {
	super();
	this.destinationFloor = destinationFloor;
}

public int getDestinationFloor() {
	return destinationFloor;
}

public void setDestinationFloor(int destinationFloor) {
	this.destinationFloor = destinationFloor;
}

}
