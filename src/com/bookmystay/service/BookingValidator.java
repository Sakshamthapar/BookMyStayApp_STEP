package com.bookmystay.service;

import com.bookmystay.repository.RoomInventory;
import com.bookmystay.util.InvalidBookingException;

public class BookingValidator {

    private RoomInventory inventory;

    public BookingValidator(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void validate(String userName, String roomType) throws InvalidBookingException {

        if (userName == null || userName.trim().isEmpty()) {
            throw new InvalidBookingException("Invalid user name!");
        }

        if (roomType == null || roomType.trim().isEmpty()) {
            throw new InvalidBookingException("Invalid room type!");
        }

        if (inventory.getAvailability(roomType) < 0) {
            throw new InvalidBookingException("Invalid inventory state!");
        }
    }
}