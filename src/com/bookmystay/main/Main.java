package com.bookmystay.main;

import com.bookmystay.model.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== BookMyStay App =====");

        // Create rooms
        Room r1 = new SingleRoom(101, 1000);
        Room r2 = new DoubleRoom(102, 2000);
        Room r3 = new SuiteRoom(103, 5000);

        // Static availability
        r2.setAvailable(false); // Example: booked

        // Display details
        displayRoom(r1);
        displayRoom(r2);
        displayRoom(r3);
    }

    public static void displayRoom(Room room) {
        System.out.println("----------------------");
        System.out.println("Room ID: " + room.getRoomId());
        System.out.println("Type: " + room.getRoomType());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Available: " + room.isAvailable());
    }
}