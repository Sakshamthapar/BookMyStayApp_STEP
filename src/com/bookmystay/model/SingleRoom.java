package com.bookmystay.model;

public class SingleRoom extends Room {

    public SingleRoom(int roomId, double price) {
        super(roomId, price);
    }

    @Override
    public String getRoomType() {
        return "Single Room";
    }
}