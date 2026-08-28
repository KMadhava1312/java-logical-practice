package com.mad.tech;

import java.util.Arrays;
import java.util.List;

public class Find2ndHighstNumMixedNuArray {
	public static void main(String[] args) {

		// Mixed Integer and Double values
		List<Number> list = Arrays.asList(10, 20.5, 30, 50.75, 40, 60.25, 50, 1000.45, 1050.45);
		
		// Find second highest number double
		//double secondHighest = list.stream().map(Number::doubleValue).distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
				                                                                
		
		double secondHighest = list.stream().map(number ->number.doubleValue()).distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
                
		System.out.println("Second Highest Number = " + secondHighest);
	}

}
