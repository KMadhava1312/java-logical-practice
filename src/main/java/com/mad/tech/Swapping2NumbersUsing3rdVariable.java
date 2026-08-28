package com.mad.tech;

import java.util.Scanner;

public class Swapping2NumbersUsing3rdVariable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int first = scanner.nextInt();

		System.out.print("Enter second number: ");
		int second = scanner.nextInt();

		int temp = first;
		first = second;
		second = temp;

		System.out.println("After Swapping..");
		System.out.println("First number: " + first);
		System.out.println("Second number: " + second);

		scanner.close();
	}
}
