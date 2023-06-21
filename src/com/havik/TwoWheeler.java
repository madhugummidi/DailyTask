package com.havik;

public class TwoWheeler extends Vehicle {
	
	private Boolean kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		//this.kickStartAvailable=kickStartAvailable;
	}
	
	public void displayDetailInfo() {
        System.out.println("---Detail Information---");
        System.out.println("Kick Start Available: " + kickStartAvailable);
    }

	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	

}
