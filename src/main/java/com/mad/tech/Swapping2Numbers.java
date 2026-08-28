package com.mad.tech;

import java.util.Scanner;

public class Swapping2Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number ");
		int first = scanner.nextInt();
		System.out.println("Enter second number");
		int second = scanner.nextInt();
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("After Swapping..");
		System.out.println("first number " + first);
		System.out.println("second number " + second);
	}
}
