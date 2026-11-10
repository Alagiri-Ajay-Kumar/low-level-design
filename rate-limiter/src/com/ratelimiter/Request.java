package com.ratelimiter;
import java.time.Instant;

public class Request{
	 private int userId;
	  private Instant timestamp;
	public Request(int userId) {
        this.userId = userId;
        this.timestamp = Instant.now();
    }

    public int getUserId() {
        return userId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

}
