package com.havik;
import java.util.Scanner;
public class HotelMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Hotel Tariff Calculator");
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        System.out.println("Select Room Type:");
        int roomType = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hotel Name:");
        String hotelName = scanner.nextLine();
        System.out.println("Room Square Feet Area:");
        int numberOfSqFeet = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Room has TV (yes/no):");
        String hasTVString = scanner.nextLine();
        boolean hasTV = hasTVString.equalsIgnoreCase("yes");
        System.out.println("Room has Wifi (yes/no):");
        String hasWifiString = scanner.nextLine();
        boolean hasWifi = hasWifiString.equalsIgnoreCase("yes");

        int roomTariff = 0;
        if (roomType == 1) {
            DeluxeRoom deluxeRoom = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            roomTariff = deluxeRoom.calculateTariff();
        } else if (roomType == 2) {
            DeluxeACRoom deluxeACRoom = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            roomTariff = deluxeACRoom.calculateTariff();
        } else if (roomType == 3) {
            SuiteACRoom suiteACRoom = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            roomTariff = suiteACRoom.calculateTariff();
        }

        System.out.println("Room Tariff per day is: " + roomTariff);

	}

}
