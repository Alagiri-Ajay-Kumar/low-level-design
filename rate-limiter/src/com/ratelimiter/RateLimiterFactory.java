
package com.ratelimiter;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterFactory {

    private Map<Tier, Configuration> configMap = new HashMap<>();
    private Map<Tier, RateLimiterStrategy> strategyMap = new HashMap<>();

    public RateLimiterFactory() {

        configMap.put(Tier.FREE, new Configuration(3, 60));
        configMap.put(Tier.PREMIUM, new Configuration(10, 60));

        strategyMap.put(Tier.FREE,
                new Fixedwindow(configMap.get(Tier.FREE)));

        strategyMap.put(Tier.PREMIUM,
                new SlidingWindow(configMap.get(Tier.PREMIUM)));
    }

    public RateLimiterStrategy getStrategy(Tier tier) {

        RateLimiterStrategy strategy = strategyMap.get(tier);

        if (strategy == null) {
            throw new IllegalArgumentException("Invalid tier");
        }

        return strategy;
    }
}
