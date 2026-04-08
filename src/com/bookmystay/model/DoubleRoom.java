package com.bookmystay.model;

public class DoubleRoom extends Room {

    public DoubleRoom(int roomId, double price) {
        super(roomId, price);
    }

    @Override
    public String getRoomType() {
        return "Double Room";
    }
}