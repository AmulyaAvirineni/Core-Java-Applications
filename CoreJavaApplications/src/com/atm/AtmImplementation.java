package com.atm;

import java.util.Scanner;

public class AtmImplementation implements AtmInterface {

    User user;
    Scanner sc = new Scanner(System.in);

    public AtmImplementation(User u) {
        this.user = u;
    }

    @Override
    public void checkBalance() throws InterruptedException {
    	Thread.sleep(1000);
        System.out.println(user.getName() + " balance: " + user.getBalance());
    }

    @Override
    public void deposit() throws InterruptedException {
        System.out.println("Enter Deposit Amount : ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            double balance = user.getBalance();
            balance = balance + amount;
            user.setBalance(balance);
            Thread.sleep(2000);
            System.out.println("Deposit Completed Successfully");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public void withdraw() throws InterruptedException {
        System.out.println("Enter Withdraw Amount : ");
        double amount = sc.nextDouble();

        if (amount > user.getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            double balance = user.getBalance();
            balance = balance - amount;
            user.setBalance(balance);
            Thread.sleep(1000);
            System.out.println("Withdraw Successfully");
        }
    }

    @Override
    public void pinChange() throws InterruptedException {
        System.out.println("Enter Old Pin : ");
        int oldpin = sc.nextInt();

        if (oldpin == user.getPin()) {
            System.out.println("Enter New Pin : ");
            int newpin = sc.nextInt();
            user.setPin(newpin);
            Thread.sleep(1000);
            System.out.println("Your Pin was Changed Successfully");
        } else {
            System.out.println("Invalid Pin");
        }
    }
}