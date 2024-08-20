package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            validateAge(15);
        } catch (MyCustomException e){
            System.out.println("Exception "+e.getMessage());
        }
    }
    public static void validateAge(int age) throws MyCustomException{
        if(age < 18){
            throw new MyCustomException("Age is less than 18");
        } else {
            System.out.println("Age is vaild");
        }
    }
}