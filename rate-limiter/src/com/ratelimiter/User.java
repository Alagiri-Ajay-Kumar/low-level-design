package com.ratelimiter;

public class User {
private int id;
private Tier tier;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, Tier tier) {
	super();
	this.id = id;
	this.tier = tier;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Tier getTier() {
	return tier;
}
public void setTier(Tier tier) {
	this.tier = tier;
}

}
