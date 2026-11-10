package com.ratelimiter;

public class Configuration {
private int maxRequets;
private int duration;

public Configuration() {
	super();
	// TODO Auto-generated constructor stub
}
public Configuration(int maxRequets, int duration) {
	super();
	this.maxRequets = maxRequets;
	this.duration = duration;
}
public int getMaxRequets() {
	return maxRequets;
}
public void setMaxRequets(int maxRequets) {
	this.maxRequets = maxRequets;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

}
