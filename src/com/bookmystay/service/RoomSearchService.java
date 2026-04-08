package com.bookmystay.service;

import com.bookmystay.repository.RoomInventory;
import java.util.Map;

public class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    // Display only available rooms
    public void showAvailableRooms() {
        System.out.println("===== Available Rooms =====");

        Map<String, Integer> data = inventory.getInventory();

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}