package com.elevatorsystem;

import java.util.*;

public interface ElevatorScheduler {
Elevator assignElevator(Request request,List<Elevator> elevators);
}
