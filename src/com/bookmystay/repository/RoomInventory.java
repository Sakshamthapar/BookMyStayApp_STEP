package com.bookmystay.repository;

import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> inventory;
    public Map<String, Integer> getInventory() {
        return inventory;
    }
    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // Add room type with count
    public void addRoomType(String type, int count) {
        inventory.put(type, count);
    }

    // Get available rooms
    public int getAvailability(String type) {
        return inventory.getOrDefault(type, 0);
    }

    // Book a room (decrease count)
    public boolean bookRoom(String type) {
        if (inventory.getOrDefault(type, 0) > 0) {
            inventory.put(type, inventory.get(type) - 1);
            return true;
        }
        return false;
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("===== Room Inventory =====");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}