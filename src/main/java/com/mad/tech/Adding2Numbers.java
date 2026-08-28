package com.mad.tech;

import java.util.Scanner;

public class Adding2Numbers {
	public static void main(String[] args) {
		Scanner scnScanner = new Scanner(System.in);
		System.out.println("Please enter the first value ");
		int first = scnScanner.nextInt();

		System.out.println("Please enter the second value ");
		int second = scnScanner.nextInt();

		int sum = first + second;
		System.out.println("Sum of given 2 numbers " + sum);
		
		scnScanner.close();
	}

}
