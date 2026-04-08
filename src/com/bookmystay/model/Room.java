package com.bookmystay.model;

public abstract class Room {
    protected int roomId;
    protected double price;
    protected boolean isAvailable;

    public Room(int roomId, double price) {
        this.roomId = roomId;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomId() { return roomId; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract method
    public abstract String getRoomType();
}