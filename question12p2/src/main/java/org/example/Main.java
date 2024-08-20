package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[10] = 30 /0;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception "+e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+e);
        } catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}