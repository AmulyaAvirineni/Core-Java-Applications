package com.loanapp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Loan implements LoanImp {

	static Scanner sc = new Scanner(System.in);

	String getCustomerName() {
		System.out.println("Enter your Full Name: ");
		String customerName = sc.nextLine();
		return customerName;
	}

	// ----------Salary info--------------------------
	public double getSalaryInfo() {
		System.out.println("Enter your Salary info:");
		double salary = sc.nextDouble();
		return salary;
	}

	public int getCustomerAge() {
		System.out.println("Enter age:");
		int age = sc.nextInt();
		return age;
	}

	// ---------Cibil score validation---------------
	public int getCibilScore() {
		System.out.println("Enter Cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	// Polymorphism Method (will override in child)
	public double getLoanROI() {
		return 0.0;
	}

	// --------Mobile Validation-------------------
	public boolean validateMobile() {
		System.out.println("Enter Mobile number:");
		String mobile = sc.next();

		String mobileRegex = "^[6-9][0-9]{9}$";
		return Pattern.matches(mobileRegex, mobile);
	}

	// ---------Aadhaar Validation------------
	public boolean validateAadhaar() {
		System.out.println("Enter Aadhaar number:");
		String aadhaar = sc.next();

		String aadhaarRegex = "^[2-9][0-9]{11}$";
		return Pattern.matches(aadhaarRegex, aadhaar);
	}

	// --------PAN Validation--------------------
	public boolean validatePan() {
		System.out.println("Enter PAN number:");
		String pan = sc.next();

		String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
		return Pattern.matches(panRegex, pan);
	}

	@Override
	public String getAddressInfo() {
		sc.nextLine();

		String address = " ";
		System.out.println("Enter flat number:");
		String flat = sc.nextLine();

		System.out.println("Enter plot number:");
		String plot = sc.nextLine();

		System.out.println("Enter street name:");
		String street = sc.nextLine();

		System.out.println("Enter city name:");
		String city = sc.nextLine();

		System.out.println("Enter pincode:");
		long pin = sc.nextLong();

		address = "Flat No:" + flat + " ,Plot Details:" + plot + " ,Street:" + street + " ,City:" + city + " ,PIN:"
				+ pin;

		return address;
	}

	public void processLoan() {

		String name = getCustomerName();
		System.out.println("Customer Name: " + name);
		if (validateAadhaar() && validatePan() && validateMobile()) {

			double salary = getSalaryInfo();
			int age = getCustomerAge();
			int cibil = getCibilScore();

			if (salary > 1200000 && age >= 22 && cibil >= 750) {
				System.out.println("Congrats your Loan got Approved !!");
				System.out.println("ROI: " + getLoanROI());

				System.out.println("Enter Address Details");
				System.out.println(getAddressInfo());
			} else {
				System.out.println("Sorry !! Your Loan got Rejected");
			}

		} else {
			System.out.println("Invalid Details!");
		}
	}

}