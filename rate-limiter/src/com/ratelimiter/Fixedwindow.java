
package com.ratelimiter;

import java.time.Instant;
import java.util.*;

public class Fixedwindow implements RateLimiterStrategy {

    private Map<Integer, Long> windowMap = new HashMap<>();
    private Map<Integer, Integer> countMap = new HashMap<>();

    private Configuration config;

    public Fixedwindow(Configuration config) {
        this.config = config;
    }

    @Override
    public boolean isValid(User user) {

        int userId = user.getId();

        long currentTime = Instant.now().getEpochSecond();

        long currentWindow = currentTime / config.getDuration();

        // First request from this user
        if (!windowMap.containsKey(userId)) {

            windowMap.put(userId, currentWindow);
            countMap.put(userId, 1);

            return true;
        }

        // Check whether the window has changed
        if (windowMap.get(userId) != currentWindow) {

            windowMap.put(userId, currentWindow);
            countMap.put(userId, 1);

            return true;
        }

        // Same window: check request limit
        int count = countMap.get(userId);

        if (count >= config.getMaxRequets()) {
            return false;
        }

        countMap.put(userId, count + 1);

        return true;
    }
}
