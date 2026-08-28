package com.mad.tech;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckEvenOrOddListUsingStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);
		System.out.println("Even Numbers");
		numbers.stream().filter(num -> (num % 2 == 0)).forEach(num -> System.out.println(num));
		System.out.println("Odd Numbers");
		numbers.stream().filter(num -> (num % 2 != 0)).forEach(num -> System.out.println(num));

		// using Collectors.partitioningBy
		List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);
		Map<Boolean, List<Integer>> numbers2 = numbersList.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println("Even number "+numbers2.get(true));
		System.out.println("Odd number "+numbers2.get(false));
	}
}
