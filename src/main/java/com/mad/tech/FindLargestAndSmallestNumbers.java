package com.mad.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindLargestAndSmallestNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 7, 15, 45, 9, 65, 87, 42, 155, 500, 17));
		
		//Descending: b.compareTo(a) 
		//Largest -> skip(0) 
		//2nd Large -> skip(1) 
		//3rd Large -> skip(2) 
		
		Integer largest = list.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(0).findFirst().get();
		System.out.println(largest);
		
		Integer secondlargest = list.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(secondlargest);
		
		Integer thrdlargest = list.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(2).findFirst().get();
		System.out.println(thrdlargest);

		//Ascending: a.compareTo(b) 
		//Smallest -> skip(0) 
		//2nd Small -> skip(1) 
		//3rd Small -> skip(2)
		
		Integer smallest = list.stream().distinct().sorted((a,b)->a.compareTo(b)).skip(0).findFirst().get();
		System.out.println(smallest);
		
		Integer secondSmallest = list.stream().distinct().sorted((a,b)->a.compareTo(b)).skip(1).findFirst().get();
		System.out.println(secondSmallest);
		
		Integer thrdSmallest = list.stream().distinct().sorted((a,b)->a.compareTo(b)).skip(2).findFirst().get();
		System.out.println(thrdSmallest);
		
	}
}
