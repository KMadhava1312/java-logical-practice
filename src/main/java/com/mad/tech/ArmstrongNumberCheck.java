package com.mad.tech;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		int originalNumber = number;
		int sum = 0;

		while (number > 0) {

			int digit = number % 10;

			sum = sum + (digit * digit * digit);

			number = number / 10;
		}

		System.out.println(originalNumber == sum ? "Given number is an Armstrong number": "Given number is not an Armstrong number");

		scanner.close();
	}
}