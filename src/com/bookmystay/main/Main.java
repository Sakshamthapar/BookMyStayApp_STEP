package com.bookmystay.main;

import com.bookmystay.repository.RoomInventory;
import com.bookmystay.service.RoomSearchService;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        // Initialize
        inventory.addRoomType("Single", 5);
        inventory.addRoomType("Double", 0); // not available
        inventory.addRoomType("Suite", 2);

        // Search service
        RoomSearchService searchService = new RoomSearchService(inventory);

        // Show available rooms
        searchService.showAvailableRooms();
    }
}