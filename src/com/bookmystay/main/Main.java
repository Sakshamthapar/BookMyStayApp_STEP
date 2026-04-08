package com.bookmystay.main;

import com.bookmystay.repository.RoomInventory;
import com.bookmystay.service.BookingHistoryService;
import com.bookmystay.util.PersistenceService;

public class Main {

    public static void main(String[] args) {

        // Try loading previous data
        RoomInventory inventory = (RoomInventory)
                PersistenceService.load("inventory.dat");

        BookingHistoryService history = (BookingHistoryService)
                PersistenceService.load("history.dat");

        // If no data exists → create new
        if (inventory == null) {
            inventory = new RoomInventory();
            inventory.addRoomType("Single", 2);
        }

        if (history == null) {
            history = new BookingHistoryService();
        }

        // Simulate system usage here...

        // Save before exit
        PersistenceService.save(inventory, "inventory.dat");
        PersistenceService.save(history, "history.dat");
    }
}