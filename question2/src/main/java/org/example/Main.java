package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = s.nextInt();
        System.out.println("Enter number 2");
        int n2 = s.nextInt();
        System.out.println("Enter number 3");
        int n3 = s.nextInt();

        int product = n1 * n2 * n3;
        System.out.println("The product of the three integers is: "+product
        );
    }
}