package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            throw new SubException("This is a subclass exception.");
        } catch (SubException e) {
            System.out.println("Caught SubException: " + e.getMessage());
        }
    }
}