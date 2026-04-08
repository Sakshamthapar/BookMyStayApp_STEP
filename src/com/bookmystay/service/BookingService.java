package com.bookmystay.service;

import com.bookmystay.model.BookingRequest;
import com.bookmystay.repository.RoomInventory;

import java.util.*;

public class BookingService {

    private Queue<BookingRequest> bookingQueue;
    private Set<String> assignedRooms;
    private Map<String, Set<String>> allocationMap;
    private RoomInventory inventory;
    private BookingHistoryService historyService;
    private BookingValidator validator;

    public BookingService(RoomInventory inventory, BookingHistoryService historyService) {
        this.inventory = inventory;
        this.historyService = historyService;
        this.validator = new BookingValidator(inventory);

        bookingQueue = new LinkedList<>();
        assignedRooms = new HashSet<>();
        allocationMap = new HashMap<>();
    }
    public synchronized void processSingleBooking(BookingRequest request, int roomCounter) {

        String type = request.getRoomType();

        if (inventory.getAvailability(type) > 0) {

            String roomId = type + "-" + roomCounter;

            if (!assignedRooms.contains(roomId)) {

                assignedRooms.add(roomId);

                allocationMap.putIfAbsent(type, new HashSet<>());
                allocationMap.get(type).add(roomId);

                inventory.bookRoom(type);

                System.out.println(Thread.currentThread().getName() +
                        " booked → " + roomId);
            }

        } else {
            System.out.println(Thread.currentThread().getName() +
                    " failed (No rooms)");
        }
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

            try {
                validator.validate(request.getUserName(), type);

                if (inventory.getAvailability(type) > 0) {

                    String roomId = type + "-" + roomCounter++;

                    if (!assignedRooms.contains(roomId)) {

                        assignedRooms.add(roomId);

                        allocationMap.putIfAbsent(type, new HashSet<>());
                        allocationMap.get(type).add(roomId);

                        inventory.bookRoom(type);

                        historyService.addRecord(
                                new com.bookmystay.model.BookingRecord(
                                        request.getUserName(),
                                        roomId,
                                        type
                                )
                        );

                        System.out.println("Booking Confirmed for "
                                + request.getUserName() + " → " + roomId);
                    }

                } else {
                    System.out.println("No rooms available for " + request.getUserName());
                }

            } catch (Exception e) {
                System.out.println("Error for " + request.getUserName() + ": " + e.getMessage());
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