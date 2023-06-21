package com.havik;

public class HotelRoom {
	protected String hotelName;
    protected Integer numberOfSqFeet;
    protected Boolean hasTV;
    protected Boolean hasWifi;
	
    public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
    
    public int calculateTariff()
    {
    	return numberOfSqFeet * getRatePerSqFeet();
    }
    
    public int getRatePerSqFeet()
    {
    	return 0;
    }

	
    
    
    
}
