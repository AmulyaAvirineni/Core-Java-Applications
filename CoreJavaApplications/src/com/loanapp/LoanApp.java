package com.loanapp;

import java.util.Scanner;

//Driver class
public class LoanApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== Loans Available =====");
		System.out.println("1. Personal Loan");
		System.out.println("2. Home Loan");
		System.out.println("3. Car Loan");

		System.out.print("Choose option: ");

		int choice = sc.nextInt();

		Loan loan = null; // Polymorphism

		switch (choice) {
		case 1:
			System.out.println("Welcome to Personal Loan");
			loan = new PersonalLoan();
			break;

		case 2:
			System.out.println("Welcome to Home Loan");
			loan = new HomeLoan();
			break;

		case 3:
			System.out.println("Welcome to Car Loan");
			loan = new CarLoan();
			break;

		default:
			System.out.println("Invalid choice!");
			return;
		}

		loan.processLoan();
		sc.close();
	}
}