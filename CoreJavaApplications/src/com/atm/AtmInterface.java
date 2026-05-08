package com.atm;

public interface AtmInterface {
	public void checkBalance() throws InterruptedException;

	public void deposit() throws InterruptedException;

	public void withdraw() throws InterruptedException;

	public void pinChange() throws InterruptedException;

}
