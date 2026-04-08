package com.bookmystay.model;

public class BookingRequest {

    private String userName;
    private String roomType;

    public BookingRequest(String userName, String roomType) {
        this.userName = userName;
        this.roomType = roomType;
    }

    public String getUserName() {
        return userName;
    }

    public String getRoomType() {
        return roomType;
    }
}