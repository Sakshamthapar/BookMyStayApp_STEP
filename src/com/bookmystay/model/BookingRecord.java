package com.bookmystay.model;

public class BookingRecord {

    private String userName;
    private String roomId;
    private String roomType;

    public BookingRecord(String userName, String roomId, String roomType) {
        this.userName = userName;
        this.roomId = roomId;
        this.roomType = roomType;
    }

    public String getUserName() { return userName; }
    public String getRoomId() { return roomId; }
    public String getRoomType() { return roomType; }
}