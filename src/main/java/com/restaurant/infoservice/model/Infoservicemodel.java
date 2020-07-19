package com.restaurant.infoservice.model; 

public class Infoservicemodel {
	private String restaurantId;
	private String restuarantName;
	private String restuarantDescription;
	
	public Infoservicemodel() {
		
	}
	
	public Infoservicemodel(String restaurantId, String restuarantName,String restuarantDescription) {
		this.restaurantId=restaurantId;
		this.restuarantName=restuarantName;
		this.restuarantDescription=restuarantDescription;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestuarantName() {
		return restuarantName;
	}

	public void setRestuarantName(String restuarantName) {
		this.restuarantName = restuarantName;
	}

	public String getRestuarantDescription() {
		return restuarantDescription;
	}

	public void setRestuarantDescription(String restuarantDescription) {
		this.restuarantDescription = restuarantDescription;
	}

}
