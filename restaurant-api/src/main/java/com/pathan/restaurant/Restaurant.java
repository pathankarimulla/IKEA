package com.pathan.restaurant;

public class Restaurant {
private String restaurantid;
private String restaurantname;
private String restaurantlocation;
public Restaurant() {
	// TODO Auto-generated constructor stub
}
public Restaurant(String restaurantid, String restaurantname, String restaurantlocation) {
	super();
	this.restaurantid = restaurantid;
	this.restaurantname = restaurantname;
	this.restaurantlocation = restaurantlocation;
}
public String getRestaurantid() {
	return restaurantid;
}
public void setRestaurantid(String restaurantid) {
	this.restaurantid = restaurantid;
}
public String getRestaurantname() {
	return restaurantname;
}
public void setRestaurantname(String restaurantname) {
	this.restaurantname = restaurantname;
}
public String getRestaurantlocation() {
	return restaurantlocation;
}
public void setRestaurantlocation(String restaurantlocation) {
	this.restaurantlocation = restaurantlocation;
}

}
