package com.atm;

public class User {
	private int accno;
	private String name;
	private int pin;
	private double balance;

	public User(int accno, String name, int pin, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	public User() {

	}

	public int getAccNo() {
		return accno;
	}

	public void setAccNo(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
