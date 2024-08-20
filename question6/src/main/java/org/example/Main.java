package org.example;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(3, 5, 2024);
        d.displayData();

        d.setDay(1);
        d.setMonth(3);
        d.setYear(2024);

        d.displayData();

        System.out.println("Month: " + d.getMonth());
        System.out.println("Day: " + d.getDay());
        System.out.println("Year: " + d.getYear());
    }
}