package com.restaurant.infoservice.controller; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.infoservice.model.Infoservicemodel;



@RestController
@RequestMapping("/api/info")
public class Infoservicecontroller {
	
	@GetMapping("/{restaurantId}")
	public Infoservicemodel getRestaurantInfo(@PathVariable("restaurantId") String restaurantId) {
		
		Infoservicemodel infoservicemodel= new Infoservicemodel();
		if ("restaurant123".equals(restaurantId)) {
			infoservicemodel=new Infoservicemodel(restaurantId,"La Restaurante","My Italian restaurant");
		}
		if ("restaurant456".equals(restaurantId)) {
			infoservicemodel=new Infoservicemodel(restaurantId,"Rolld","My vietnamese restaurant");
		}
		if ("restaurant789".equals(restaurantId)) {
			infoservicemodel=new Infoservicemodel(restaurantId,"Mad Mex","My Mexican restaurant");
		}
		
		return infoservicemodel;
	}
}
