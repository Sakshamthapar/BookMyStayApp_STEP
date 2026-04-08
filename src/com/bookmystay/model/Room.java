package com.bookmystay.model;

public class Room {
    private int roomId;
    private String type;
    private double price;
    private boolean isAvailable;

    public Room(int roomId, String type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomId() { return roomId; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}