\# Elevator System – Low-Level Design



A console-based Elevator System implemented in Java using object-oriented design principles and the Strategy design pattern.



\## Version



Current version: \*\*v1.0\*\*



\## Features



\* Supports multiple elevators

\* Accepts source-floor and destination-floor requests

\* Represents floor and cabin requests separately

\* Tracks elevator state, direction, and current floor

\* Selects an elevator using the nearest-elevator strategy

\* Keeps scheduling logic separate from the elevator system



\## Design Overview



\* `FloorRequest` – Represents the passenger’s source floor and requested direction

\* `CabinRequest` – Represents the destination floor selected inside the elevator

\* `Request` – Combines the floor request and cabin request

\* `Elevator` – Maintains the elevator ID, current floor, state, and direction

\* `ElevatorState` – Defines the possible operational states of an elevator

\* `Direction` – Defines elevator movement directions

\* `ElevatorScheduler` – Defines the contract for elevator-selection strategies

\* `NearestElevatorStrategy` – Selects the elevator nearest to the requested source floor

\* `ElevatorSystem` – Manages elevators and processes requests

\* `Driver` – Creates the required objects and demonstrates the system flow



\## Design Pattern



\### Strategy Pattern



The `ElevatorScheduler` interface separates elevator-selection logic from the main `ElevatorSystem`.



The current implementation uses `NearestElevatorStrategy`. Additional scheduling strategies can be introduced without modifying the core elevator-management flow.



\## Request Flow



1\. A passenger submits a floor request.

2\. The passenger selects a destination floor.

3\. Both inputs are combined into a request.

4\. The scheduler selects the nearest elevator.

5\. The elevator processes the request and updates its state, direction, and current floor.



\## Project Structure



```text

elevator-system/

└── src/

&#x20;   └── com/

&#x20;       └── elevatorsystem/

&#x20;           ├── CabinRequest.java

&#x20;           ├── Direction.java

&#x20;           ├── Driver.java

&#x20;           ├── Elevator.java

&#x20;           ├── ElevatorScheduler.java

&#x20;           ├── ElevatorState.java

&#x20;           ├── ElevatorSystem.java

&#x20;           ├── FloorRequest.java

&#x20;           ├── NearestElevatorStrategy.java

&#x20;           └── Request.java

```



\## Current Scope



This is a basic synchronous implementation created to demonstrate low-level design, object collaboration, and scheduling-strategy separation.



\## Planned Enhancements



\* Add direction-aware elevator scheduling

\* Process simultaneous requests

\* Run elevators independently using concurrency

\* Add request queues

\* Add capacity and fault-handling support

\* Improve validation and exception handling



\## Technologies and Concepts



\* Java

\* Object-Oriented Programming

\* Low-Level Design

\* Strategy Design Pattern



