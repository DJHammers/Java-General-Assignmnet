package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] grades = new int[20];
        int count = 0;

        for(int i=0; i<20; i++){
            System.out.println("Enter grade "+(i+1));
            int grade = s.nextInt();

            if(grade == -1){
                break;
            }

            grades[count] = grade;
            count++;
        }
        if(count > 0){
            double average = calAvg(grades, count);
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("The average of grades is : "+df.format(average));
        } else {
            System.out.println("No grades entered.");
        }
    }
    public static double calAvg(int[] grades, int count){
        int sum = 0;
        for(int i=0; i<count; i++){
            sum+= grades[i];
        }
        return (double) sum/ count;
    }
}