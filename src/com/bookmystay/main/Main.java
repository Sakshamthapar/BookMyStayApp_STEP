package com.bookmystay.main;

import com.bookmystay.model.BookingRequest;
import com.bookmystay.service.BookingService;

public class Main {

    public static void main(String[] args) {

        BookingService service = new BookingService();

        // Add booking requests
        service.addRequest(new BookingRequest("Saksham", "Single"));
        service.addRequest(new BookingRequest("Rahul", "Double"));
        service.addRequest(new BookingRequest("Amit", "Suite"));

        // View queue
        service.viewRequests();
    }
}