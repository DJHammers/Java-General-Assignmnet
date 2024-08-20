package org.example;

public class Main {
    public static void main(String[] args) {
        Sedan s = new Sedan(120, 20000, "Blue", 21);
        Ford f1 = new Ford(150, 26000, "Blue", 2023, 2000);
        Ford f2 = new Ford(160, 28000, "Blue", 2024, 1500);
        Truck t = new Truck(120, 40000, "Black", 2400);

        System.out.println("Sedan Sale price: " + s.getSalePrice());
        System.out.println("Ford1 Sale price: " + f1.getSalePrice());
        System.out.println("Ford2 Sale price: " + f2.getSalePrice());
        System.out.println("Truck Sale price: " + t.getSalePrice());
    }
}