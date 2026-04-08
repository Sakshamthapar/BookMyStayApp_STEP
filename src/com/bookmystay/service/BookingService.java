package com.bookmystay.service;

import com.bookmystay.model.BookingRequest;
import com.bookmystay.repository.RoomInventory;

import java.util.*;

public class BookingService {

    private Queue<BookingRequest> bookingQueue;
    private Set<String> assignedRooms;
    private Map<String, Set<String>> allocationMap;
    private RoomInventory inventory;

    public BookingService(RoomInventory inventory) {
        this.inventory = inventory;
        bookingQueue = new LinkedList<>();
        assignedRooms = new HashSet<>();
        allocationMap = new HashMap<>();
    }

    // Add request
    public void addRequest(BookingRequest request) {
        bookingQueue.add(request);
        System.out.println("Request added for " + request.getUserName());
    }

    // Process requests
    public void processBookings() {
        System.out.println("\n===== Processing Bookings =====");

        int roomCounter = 1;

        while (!bookingQueue.isEmpty()) {
            BookingRequest request = bookingQueue.poll();
            String type = request.getRoomType();

            if (inventory.getAvailability(type) > 0) {

                // Generate unique room ID
                String roomId = type + "-" + roomCounter++;

                // Prevent duplicate
                if (!assignedRooms.contains(roomId)) {

                    assignedRooms.add(roomId);

                    allocationMap.putIfAbsent(type, new HashSet<>());
                    allocationMap.get(type).add(roomId);

                    inventory.bookRoom(type);

                    System.out.println("Booking Confirmed for "
                            + request.getUserName() + " → Room ID: " + roomId);
                }

            } else {
                System.out.println("No rooms available for "
                        + request.getUserName());
            }
        }
    }

    // View allocation
    public void displayAllocations() {
        System.out.println("\n===== Room Allocations =====");

        for (Map.Entry<String, Set<String>> entry : allocationMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}