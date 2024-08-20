package org.example;

public class Main {
    public static void main(String[] args) {
        DerivedClass1 d1 = new DerivedClass1();
        d1.performTask();
        d1.debug();

        DerivedClass2 d2 = new DerivedClass2();
        d2.performTask();
        d2.debug();
    }
}