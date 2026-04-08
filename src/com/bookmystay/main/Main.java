package com.bookmystay.main;

import com.bookmystay.service.*;
import com.bookmystay.repository.RoomInventory;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 2);

        CancellationService cancelService = new CancellationService(inventory);

        // Simulate cancellation
        cancelService.cancelBooking("Single-1", "Single");
        cancelService.cancelBooking("Single-2", "Single");

        cancelService.showCancelled();
    }
}