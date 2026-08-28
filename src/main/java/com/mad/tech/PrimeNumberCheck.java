package com.mad.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumberCheck {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 11, 13, 15, 17, 19, 21, 23, 25, 29, 31, 35, 37, 41, 45, 49, 51,
						53, 57, 59, 67, 71, 73, 87, 97, 100, 101, 103, 121, 127, 155, 200, 4033, 451));

		numbers.stream().filter(number -> isPrime(number)).forEach(i -> System.out.println(i));

		System.out.println("=================================================================");

		numbers.stream().filter(number -> !isPrime(number)).forEach(i -> System.out.println(i));
		//indivudl number check
		int input = 4033;
		boolean result = isPrime(input);
		if (result) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		} else {
			return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
			//return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i == 0);
		}
	}
}
