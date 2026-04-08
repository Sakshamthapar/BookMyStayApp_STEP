package com.bookmystay.model;

import java.util.*;

public class Hotel {
    private int hotelId;
    private String name;
    private String location;
    private Map<Integer, Room> rooms;

    public Hotel(int hotelId, String name, String location) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.rooms = new HashMap<>();
    }

    public int getHotelId() { return hotelId; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public Map<Integer, Room> getRooms() { return rooms; }
}