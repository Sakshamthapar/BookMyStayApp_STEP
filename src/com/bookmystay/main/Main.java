package com.bookmystay.main;

import com.bookmystay.model.BookingRequest;
import com.bookmystay.repository.RoomInventory;
import com.bookmystay.service.*;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 2);

        BookingHistoryService history = new BookingHistoryService();
        BookingService service = new BookingService(inventory, history);

        // Create requests
        BookingRequest r1 = new BookingRequest("User1", "Single");
        BookingRequest r2 = new BookingRequest("User2", "Single");
        BookingRequest r3 = new BookingRequest("User3", "Single");

        // Create threads
        Thread t1 = new Thread(new BookingTask(service, r1, 1));
        Thread t2 = new Thread(new BookingTask(service, r2, 2));
        Thread t3 = new Thread(new BookingTask(service, r3, 3));

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}