package com.bookmystay.service;

import com.bookmystay.model.BookingRecord;
import java.util.*;

public class BookingHistoryService {

    private List<BookingRecord> history;

    public BookingHistoryService() {
        history = new ArrayList<>();
    }

    // Add record
    public void addRecord(BookingRecord record) {
        history.add(record);
    }

    // Show all history
    public void showHistory() {
        System.out.println("\n===== Booking History =====");

        for (BookingRecord r : history) {
            System.out.println(r.getUserName() +
                    " → " + r.getRoomId() +
                    " (" + r.getRoomType() + ")");
        }
    }

    // Generate simple report
    public void generateReport() {
        System.out.println("\n===== Booking Report =====");

        Map<String, Integer> report = new HashMap<>();

        for (BookingRecord r : history) {
            report.put(r.getRoomType(),
                    report.getOrDefault(r.getRoomType(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() +
                    " bookings → " + entry.getValue());
        }
    }
}