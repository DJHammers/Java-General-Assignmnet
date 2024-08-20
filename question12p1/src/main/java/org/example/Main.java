package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            int size = -5;
            int [] arr = new int[size];
        } catch (NegativeArraySizeException e){
            System.out.println("Cannot create an array of negative size "+ e);
        }
    }
}