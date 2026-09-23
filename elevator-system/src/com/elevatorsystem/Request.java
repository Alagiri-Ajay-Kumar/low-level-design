package com.elevatorsystem;

public class Request {
	private FloorRequest floorRequest;
	private CabinRequest cabinRequest;
	
	
	public Request(FloorRequest floorRequest, CabinRequest cabinRequest) {
		super();
		this.floorRequest = floorRequest;
		this.cabinRequest = cabinRequest;
	}
	public FloorRequest getFloorRequest() {
		return floorRequest;
	}
	public void setFloorRequest(FloorRequest floorRequest) {
		this.floorRequest = floorRequest;
	}
	public CabinRequest getCabinRequest() {
		return cabinRequest;
	}
	public void setCabinRequest(CabinRequest cabinRequest) {
		this.cabinRequest = cabinRequest;
	}
	

}
