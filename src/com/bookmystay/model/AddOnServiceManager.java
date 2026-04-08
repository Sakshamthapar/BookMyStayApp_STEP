package com.bookmystay.service;

import com.bookmystay.model.AddOnService;
import java.util.*;

public class AddOnServiceManager {

    private Map<String, List<AddOnService>> serviceMap;

    public AddOnServiceManager() {
        serviceMap = new HashMap<>();
    }

    // Add service to reservation
    public void addService(String reservationId, AddOnService service) {

        serviceMap.putIfAbsent(reservationId, new ArrayList<>());
        serviceMap.get(reservationId).add(service);

        System.out.println("Added " + service.getServiceName() + " to " + reservationId);
    }

    // Display services
    public void showServices(String reservationId) {

        System.out.println("\nServices for " + reservationId);

        List<AddOnService> services = serviceMap.get(reservationId);

        if (services == null || services.isEmpty()) {
            System.out.println("No services added.");
            return;
        }

        double total = 0;

        for (AddOnService s : services) {
            System.out.println(s.getServiceName() + " → ₹" + s.getPrice());
            total += s.getPrice();
        }

        System.out.println("Total Add-On Cost: ₹" + total);
    }
}