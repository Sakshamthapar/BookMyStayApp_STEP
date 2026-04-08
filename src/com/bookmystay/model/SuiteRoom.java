package com.bookmystay.model;

public class SuiteRoom extends Room {

    public SuiteRoom(int roomId, double price) {
        super(roomId, price);
    }

    @Override
    public String getRoomType() {
        return "Suite Room";
    }
}