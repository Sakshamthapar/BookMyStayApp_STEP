package com.bookmystay.main;

import com.bookmystay.model.BookingRequest;
import com.bookmystay.repository.RoomInventory;
import com.bookmystay.service.*;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 2);
        inventory.addRoomType("Double", 1);

        BookingHistoryService history = new BookingHistoryService();
        BookingService service = new BookingService(inventory, history);

        // Add requests
        service.addRequest(new BookingRequest("Saksham", "Single"));
        service.addRequest(new BookingRequest("Rahul", "Single"));
        service.addRequest(new BookingRequest("Amit", "Single"));

        // Process
        service.processBookings();

        // Show history
        history.showHistory();

        // Report
        history.generateReport();
    }
}