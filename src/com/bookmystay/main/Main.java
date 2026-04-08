package com.bookmystay.main;

import com.bookmystay.model.BookingRequest;
import com.bookmystay.repository.RoomInventory;
import com.bookmystay.service.BookingService;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        // Initialize inventory
        inventory.addRoomType("Single", 2);
        inventory.addRoomType("Double", 1);

        BookingService service = new BookingService(inventory);

        // Add requests
        service.addRequest(new BookingRequest("Saksham", "Single"));
        service.addRequest(new BookingRequest("Rahul", "Single"));
        service.addRequest(new BookingRequest("Amit", "Single")); // extra

        service.addRequest(new BookingRequest("Neha", "Double"));
        service.addRequest(new BookingRequest("Riya", "Double")); // extra

        // Process bookings
        service.processBookings();

        // Show allocations
        service.displayAllocations();
    }
}