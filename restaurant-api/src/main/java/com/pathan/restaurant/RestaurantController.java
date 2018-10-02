package com.pathan.restaurant;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
	@Autowired
 public	RestaurantService restaurantService;
@RequestMapping("/restaurants")
 public List<Restaurant> getRestaurents()
 {
	 return restaurantService.getRestaurants();
 }

@RequestMapping("/restaurants/{id}")
public Restaurant getRestaurant(@PathVariable String id)
{
	return restaurantService.getRestaurant(id);
}
@RequestMapping(method=RequestMethod.DELETE, value="/restaurants/{id}")
public void deleterestaurant(@PathVariable String id)
{
	restaurantService.deleterestaurant(id);
}
@RequestMapping(method=RequestMethod.POST, value="/restaurants")
public void addrestaurant(@RequestBody Restaurant restaurant)
{
	restaurantService.addRestaurant(restaurant);
}
@RequestMapping(method=RequestMethod.PUT, value="/restaurants/{id}")
public void updateRestaurant(@RequestBody Restaurant restaurant,@PathVariable String id)
{
	restaurantService.updateRestaurant(restaurant, id);
}
}
