package com.havik;

public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;	
	}
	
	public int getRatePerSqFeet()
	{
		if(hasWifi)
		{
			return ratePerSqFeet+2;
		}
		else
		{
			return ratePerSqFeet;
		}
	}
}
