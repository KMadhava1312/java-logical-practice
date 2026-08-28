package com.mad.tech;

import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number ");
		int input = scanner.nextInt();
		if (input % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}

		scanner.close();
	}
}
