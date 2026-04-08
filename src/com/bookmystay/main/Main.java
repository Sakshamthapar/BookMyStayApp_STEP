package com.bookmystay.main;

import com.bookmystay.model.AddOnService;
import com.bookmystay.service.AddOnServiceManager;

public class Main {

    public static void main(String[] args) {

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "Single-1";

        // Add services
        manager.addService(reservationId, new AddOnService("Food", 500));
        manager.addService(reservationId, new AddOnService("Spa", 1000));
        manager.addService(reservationId, new AddOnService("WiFi", 200));

        // Show services
        manager.showServices(reservationId);
    }
}