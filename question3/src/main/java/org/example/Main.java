package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double f = s.nextDouble();
        double celsius = (5.0/9.0) * (f-32);
        System.out.println("The temperature in Celsius is: "+celsius);
    }
}