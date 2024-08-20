package org.example;

public class SavingAccount {
    public static double annualInterestRate;
    public double savingsBalance;

    public SavingAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public double getsavingsBalance(){
        return savingsBalance;
    }
    public static void modifyInterestRate(double interestRate){
        annualInterestRate = interestRate;
    }
}
