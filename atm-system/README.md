ATM System – Low-Level Design



A Java-based ATM system developed incrementally to demonstrate low-level design principles and behavioral design patterns.



Versions

v1.0 – Cash Dispenser



The current version implements the ATM cash-dispenser component using the Chain of Responsibility design pattern.



v2.0 – Complete ATM System



The planned version will extend the same project with ATM transaction states using the State design pattern.



v1.0 Features

Accepts a withdrawal amount

Calculates the required number of currency notes

Supports ₹500, ₹200, and ₹100 denominations

Passes the remaining amount through a dispenser chain

Keeps each denomination’s dispensing responsibility in a separate class

Assumes unlimited availability of notes for every supported denomination

Design Overview

CashDispenser – Defines the common cash-dispensing contract and maintains the next handler in the chain

FiveHundredDispenser – Dispenses ₹500 notes and forwards the remaining amount

TwoHundredDispenser – Dispenses ₹200 notes and forwards the remaining amount

HundredDispenser – Dispenses ₹100 notes

CashDispenserSystem – Creates and manages the dispenser chain

Driver – Demonstrates the cash-dispensing flow with sample withdrawal amounts

Design Pattern

Chain of Responsibility



The dispensers are connected in the following order:



₹500 Dispenser → ₹200 Dispenser → ₹100 Dispenser



Each handler:



Calculates how many notes of its denomination can be dispensed.

Calculates the remaining amount.

Passes the remainder to the next handler.



This design separates denomination-specific logic and allows another denomination to be introduced without changing the complete dispensing flow.



Current Assumptions

₹500, ₹200, and ₹100 are the only supported denominations

Each denomination has an unlimited number of notes

Note inventory is not tracked

The implementation focuses on the cash-dispensing flow

Card authentication, account operations, and transaction states are outside v1.0

Project Structure

atm-system/

└── src/

&#x20;   └── com/

&#x20;       └── atm/

&#x20;           ├── CashDispenser.java

&#x20;           ├── CashDispenserSystem.java

&#x20;           ├── Driver.java

&#x20;           ├── FiveHundredDispenser.java

&#x20;           ├── HundredDispenser.java

&#x20;           └── TwoHundredDispenser.java

Planned v2.0 Enhancements

Add a complete ATM workflow using the State pattern

Add card insertion and ejection

Add PIN authentication

Add transaction selection

Integrate withdrawal with the cash dispenser

Add balance inquiry

Add validation and error handling

Add note inventory and insufficient-cash handling

Technologies and Concepts

Java

Object-Oriented Programming

Low-Level Design

Chain of Responsibility Design Pattern

State Design Pattern planned for v2.0

