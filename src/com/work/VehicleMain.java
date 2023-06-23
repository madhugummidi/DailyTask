package com.work;
import java.util.*;
public class VehicleMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("1. Four Wheeler");
        System.out.println("2. Two Wheeler");
        System.out.println("Enter Vehicle Type:");
        int vehicleType = scanner.nextInt();

        System.out.println("Vehicle Make:");
        String make = scanner.next();

        System.out.println("Vehicle Number:");
        String vehicleNumber = scanner.next();

        System.out.println("Fuel Type:");
        System.out.println("1. Petrol");
        System.out.println("2. Diesel");
        int fuelTypeChoice = scanner.nextInt();
        String fuelType = (fuelTypeChoice == 1) ? "Petrol" : "Diesel";

        System.out.println("Fuel Capacity:");
        int fuelCapacity = scanner.nextInt();

        System.out.println("Engine CC:");
        int cc = scanner.nextInt();

        Vehicle vehicle;

        if (vehicleType == 1) {
            System.out.println("Audio System:");
            String audioSystem = scanner.next();

            System.out.println("Number of Doors:");
            int numberOfDoors = scanner.nextInt();

            vehicle = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc);
        } else {
            System.out.println("Kick Start Available (true/false):");
            boolean kickStartAvailable = scanner.nextBoolean();

            vehicle = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc);
        }

        System.out.println("***" + vehicle.getMake() + "***");
        vehicle.displayBasicInfo();
        vehicle.displayDetailInfo();
        }

	}

