package com.bookmystay.service;

import com.bookmystay.model.BookingRequest;
import java.util.LinkedList;
import java.util.Queue;

public class BookingService {

    private Queue<BookingRequest> bookingQueue;

    public BookingService() {
        bookingQueue = new LinkedList<>();
    }

    // Add request to queue
    public void addRequest(BookingRequest request) {
        bookingQueue.add(request);
        System.out.println("Request added for " + request.getUserName());
    }

    // View all requests
    public void viewRequests() {
        System.out.println("===== Booking Queue =====");
        for (BookingRequest req : bookingQueue) {
            System.out.println(req.getUserName() + " → " + req.getRoomType());
        }
    }
}