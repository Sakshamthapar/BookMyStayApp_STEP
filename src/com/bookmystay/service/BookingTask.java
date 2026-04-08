package com.bookmystay.service;

import com.bookmystay.model.BookingRequest;

public class BookingTask implements Runnable {

    private BookingService service;
    private BookingRequest request;
    private int roomCounter;

    public BookingTask(BookingService service, BookingRequest request, int roomCounter) {
        this.service = service;
        this.request = request;
        this.roomCounter = roomCounter;
    }

    @Override
    public void run() {
        service.processSingleBooking(request, roomCounter);
    }
}