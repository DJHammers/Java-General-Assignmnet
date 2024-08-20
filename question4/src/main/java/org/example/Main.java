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

        int sum  = n1+n2+n3;
        int product = n1*n2*n3;
        int avg = sum/3;
        int ln;
        if(n1>n2 && n1>n3){
            ln=n1;
        } else if(n2>n1 &&n2>n3) {
            ln=n2;
        } else{
            ln=n3;
        }

        int sm;
        if(n1<n2 && n1<n3){
            sm=n1;
        } else if(n2<n1 &&n2<n3) {
            sm=n2;
        } else{
            sm=n3;
        }

        System.out.println("Sum is: "+sum);
        System.out.println("Product is: "+product);
        System.out.println("Average is: "+avg);
        System.out.println("Smallest number is: "+sm);
        System.out.println("Largest number is: "+ln);

    }
}