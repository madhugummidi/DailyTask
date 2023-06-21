package com.havik;

public class SuiteACRoom extends DeluxeACRoom{
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
	public int getRatePerSqFeet()
	{
		if(hasWifi)
		{
			return ratePerSqFeet + 2;
			
		}
		else
		{
			return ratePerSqFeet;
		}
	}

}
