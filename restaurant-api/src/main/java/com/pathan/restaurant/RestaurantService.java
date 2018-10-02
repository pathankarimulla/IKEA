package com.pathan.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
@Service

public class RestaurantService {

	List<Restaurant> restaurants=new ArrayList<Restaurant>(Arrays.asList(
			
			new Restaurant("BLR00012", "BaharCafe", "Marthahalli"),
			new Restaurant("BLR00014", "Sethakarni", "Marthahalli"),
			new Restaurant("BLR00013", "HyderbadBiryani", "Marthahalli"),
			new Restaurant("BLR00015", "BiryaniHouse", "Marthahalli")
			
			));

public List<Restaurant> getRestaurants()
{
	return restaurants;
}

public Restaurant getRestaurant(String id)
{
	return restaurants.stream().filter(r -> r.getRestaurantid().equals(id)).findFirst().get();
}

public void deleterestaurant(String id)
{
	restaurants.removeIf(r -> r.getRestaurantid().equals(id));
}

public void addRestaurant(Restaurant restaurant)
{
	restaurants.add(restaurant);
}

public void updateRestaurant(Restaurant restaurant, String id)
{
	
for(int i=0;i<restaurants.size();i++)
{
	Restaurant r=restaurants.get(i);
	if(r.getRestaurantid().equals(id))
	{
		restaurants.set(i, restaurant);
	}
}
}
}
