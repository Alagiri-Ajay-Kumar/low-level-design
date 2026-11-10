package com.ratelimiter;

public interface RateLimiterStrategy {
boolean isValid(User user);
}
