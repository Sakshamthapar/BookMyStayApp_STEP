package com.bookmystay.model;

public class Booking {
    private int bookingId;
    private User user;
    private Room room;

    public Booking(int bookingId, User user, Room room) {
        this.bookingId = bookingId;
        this.user = user;
        this.room = room;
    }

    public int getBookingId() { return bookingId; }
    public User getUser() { return user; }
    public Room getRoom() { return room; }
}