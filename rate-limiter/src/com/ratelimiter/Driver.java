package com.ratelimiter;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		User user=new User(1,Tier.PREMIUM);
		User us=new User(2,Tier.FREE);
				
		RateLimiterFactory factory=new RateLimiterFactory();
		
		RateLimiterService service=new RateLimiterService(factory);
		
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		service.addRequest(user);
		
		service.addRequest(us);
		service.addRequest(us);
		service.addRequest(us);
		Thread.sleep(61000);
		service.addRequest(us);
		
		
		
		
		

	}

}
