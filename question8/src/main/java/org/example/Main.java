package org.example;

public class Main {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        SavingAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after 1 month %4 interest: "+ saver1.getsavingsBalance());
        System.out.println("Saver 2 balance after 1 month %4 interest: "+ saver2.getsavingsBalance());

        SavingAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after 1 month %5 interest: "+ saver1.getsavingsBalance());
        System.out.println("Saver 2 balance after 1 month %5 interest: "+ saver2.getsavingsBalance());
    }
}