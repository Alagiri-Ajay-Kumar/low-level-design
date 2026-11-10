\# Rate Limiter – Low-Level Design



\## Overview



A Rate Limiter is a system design component that controls the number of requests a user can make within a specified time interval.



This project demonstrates a Java-based Rate Limiter using the \*\*Strategy Design Pattern\*\* and \*\*Factory Design Pattern\*\*, with different rate-limiting strategies based on user tiers.



\## Problem Statement



Design a Rate Limiter that:



\- Controls the number of requests made by individual users.

\- Supports multiple rate-limiting algorithms.

\- Applies different rate limits based on user tiers.

\- Maintains independent request-tracking state for each user.

\- Allows new rate-limiting strategies to be introduced without modifying the core service.



\## Design Patterns Used



\### 1. Strategy Design Pattern



The Strategy Pattern allows different rate-limiting algorithms to be implemented behind a common interface.



`RateLimiterStrategy` defines the contract, while individual implementations provide their respective algorithms.



\### 2. Factory Design Pattern



The Factory Pattern centralizes the creation and selection of rate-limiting strategies based on the user's tier.



This keeps strategy selection separate from the Driver and service classes.



\## Rate Limiting Strategies



| Strategy | Description |

|---|---|

| Fixed Window | Allows a configured number of requests within a fixed time window. |

| Sliding Window | Tracks requests over a rolling time window to enforce the configured limit. |



\## User Tiers



The system supports two user tiers:



| User Tier | Strategy | Configuration |

|---|---|---|

| FREE | Fixed Window | 3 requests / 60 seconds |

| PREMIUM | Sliding Window | 10 requests / 60 seconds |



\## Class Responsibilities



| Class | Responsibility |

|---|---|

| `User` | Represents a user and their tier. |

| `Tier` | Defines available user tiers: FREE and PREMIUM. |

| `Request` | Represents an incoming request. |

| `Configuration` | Holds rate-limit configuration. |

| `RateLimiterStrategy` | Common interface for rate-limiting algorithms. |

| `Fixedwindow` | Implements the Fixed Window algorithm. |

| `SlidingWindow` | Implements the Sliding Window algorithm. |

| `RateLimiterFactory` | Creates the appropriate strategy based on user tier. |

| `RateLimiterService` | Handles rate-limiting operations using the selected strategy. |

| `Driver` | Demonstrates the rate limiter implementation. |



\## Design Highlights



\- \*\*Loose Coupling:\*\* The service depends on the strategy abstraction rather than concrete implementations.

\- \*\*Extensibility:\*\* New rate-limiting algorithms can be introduced without changing the existing service logic.

\- \*\*User-specific State:\*\* Each user maintains independent request-tracking state.

\- \*\*Centralized Strategy Selection:\*\* The factory handles strategy creation based on user tier.

\- \*\*Separation of Concerns:\*\* Strategy selection, rate-limiting logic and request execution are handled by separate components.



\## Technologies Used



\- Java

\- Object-Oriented Programming

\- Strategy Design Pattern

\- Factory Design Pattern

\- Java Collections Framework



\## Future Enhancements



\- Add Token Bucket and Leaky Bucket algorithms.

\- Introduce thread-safe request tracking.

\- Support distributed rate limiting using Redis.

\- Add configurable rate limits without modifying source code.

\- Introduce unit tests for different rate-limiting scenarios.



\## Learning Outcomes



This project helped explore practical application of design patterns, abstraction, loose coupling, object-oriented design and extensible system architecture through a real-world backend engineering problem.



