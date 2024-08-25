package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            riskyMethod();
        } catch (ExampleException e){
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
    public static void riskyMethod() throws ExampleException{
        throw new ExampleException("riskymethod() exception");

    }
}