package com.ratelimiter;

import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow implements RateLimiterStrategy {
	private Configuration config;
	
	public SlidingWindow(Configuration config) {
		super();
		this.config = config;
	}
	private HashMap<Integer,Queue<Instant>> map =new HashMap<>();
	@Override
	public boolean isValid(User user) {
		Instant currentTime = Instant.now();
		if(map.containsKey(user.getId()))
		{
		 
		 
		 Queue<Instant> q=map.get(user.getId());
		 Instant cutoff = currentTime.minusSeconds(config.getDuration());

		 while (!q.isEmpty() && ( q.peek()).isBefore(cutoff)) {
		     q.poll();
		     
		 }
		 if(q.size()>=config.getMaxRequets()) return false;
		 q.add(currentTime);
		 
		 }
		else 
		{
			Queue<Instant> queue=new LinkedList<>();
			queue.add(currentTime);
			map.put(user.getId(), queue);
		}
		
		return true;
		
	}

}
