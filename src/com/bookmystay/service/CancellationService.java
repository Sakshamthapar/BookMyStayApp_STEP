package com.bookmystay.service;

import java.util.*;
import com.bookmystay.repository.RoomInventory;

public class CancellationService {

    private Stack<String> cancelledRooms;
    private RoomInventory inventory;

    public CancellationService(RoomInventory inventory) {
        this.inventory = inventory;
        cancelledRooms = new Stack<>();
    }

    // Cancel booking
    public void cancelBooking(String roomId, String roomType) {

        if (roomId == null || roomId.isEmpty()) {
            System.out.println("Invalid cancellation request!");
            return;
        }

        cancelledRooms.push(roomId);

        // Restore inventory
        inventory.addRoomType(roomType,
                inventory.getAvailability(roomType) + 1);

        System.out.println("Cancelled booking → " + roomId);
    }

    // Show rollback history
    public void showCancelled() {
        System.out.println("\n===== Cancelled Bookings =====");

        for (String id : cancelledRooms) {
            System.out.println(id);
        }
    }
}