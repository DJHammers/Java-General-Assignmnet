package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[10] = 30;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+ e);
        } catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException "+ e);
        } catch (Exception e){
            System.out.println("Exception "+ e);
        }
    }
}