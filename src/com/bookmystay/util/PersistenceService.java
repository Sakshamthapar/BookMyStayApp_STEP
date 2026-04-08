package com.bookmystay.util;

import java.io.*;

public class PersistenceService {

    // Save object
    public static void save(Object obj, String fileName) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(obj);
            System.out.println("Data saved successfully!");

        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load object
    public static Object load(String fileName) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            System.out.println("Data loaded successfully!");
            return ois.readObject();

        } catch (Exception e) {
            System.out.println("No previous data found.");
            return null;
        }
    }
}