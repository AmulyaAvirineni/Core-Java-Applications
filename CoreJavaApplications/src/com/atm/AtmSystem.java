package com.atm;

import java.util.Scanner;

public class AtmSystem {

	public static void main(String[] args) throws InterruptedException  {
		Scanner sc = new Scanner(System.in);
		User[] a = new User[2];
		a[0] = new User(88899, "Amulya", 3456, 10000);
		a[1] = new User(88891, "Deeksha", 4567, 11000);

		System.out.println("Enter Account Number : ");
		int acc = sc.nextInt();

		System.out.println("Enter Pin Number : ");
		int pin = sc.nextInt();

		boolean status = false;
		User user = null;

		for (User u : a) {
			if (u.getAccNo() == acc && u.getPin() == pin) {
				status = true;
				user = u;
				break;
			}
		}

		if (status) {
			System.out.println(user.getName() + " Welcome to SBI services ");

			AtmInterface atm = new AtmImplementation(user);

			boolean flag = true;
			while (flag) {
				System.out.println("1.checkBalance\n2.deposit\n3.withdraw\n4.pinChange\n5.exit");
				System.out.println("Enter Your Choice : ");

				int ch = sc.nextInt();

				switch (ch) {
				case 1:
					atm.checkBalance();
					break;
				case 2:
					atm.deposit();
					break;
				case 3:
					atm.withdraw();
					break;
				case 4:
					atm.pinChange();
					break;
				case 5:
					flag = false;
					System.out.println("Thank You for using SBI Services");
					break;
				default:
					System.out.println("Invalid Choice");
					break;

				}
			}
		}
		sc.close();

	}

}
