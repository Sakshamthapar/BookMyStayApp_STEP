package com.bookmystay.main;

import com.bookmystay.repository.RoomInventory;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== BookMyStay App =====");

        RoomInventory inventory = new RoomInventory();

        // Initialize inventory
        inventory.addRoomType("Single", 5);
        inventory.addRoomType("Double", 3);
        inventory.addRoomType("Suite", 2);

        // Display initial state
        inventory.displayInventory();

        // Book a room
        System.out.println("\nBooking a Single Room...");
        inventory.bookRoom("Single");

        // Display updated state
        inventory.displayInventory();
    }
}