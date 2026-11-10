package com.ratelimiter;
import java.util.*;
public class RateLimiterService {

	 private RateLimiterFactory factory;

	    public RateLimiterService(RateLimiterFactory factory) {
	        this.factory = factory;
	    }

public void addRequest(User user)
{
	RateLimiterStrategy strategy=factory.getStrategy(user.getTier());
if(strategy.isValid(user)) {
	System.out.println("Code : 200 The request has been processed successfully");
}
else 
{
	System.out.println("Code : 429 too many requests please try after sometime");
}

	
	
}


}
