package com.loanapp;

//if we do not give any modifiers to abstract methods by default they are public,abstract
public interface LoanImp {

	double getSalaryInfo();

	int getCustomerAge();

	int getCibilScore();

	double getLoanROI();

	boolean validateMobile();

	boolean validateAadhaar();

	boolean validatePan();

	String getAddressInfo();

}