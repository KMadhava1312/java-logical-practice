package com.mad.tech;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosRight {
	public static void main(String[] args) {
		int[] array = { 7, 0, 5, 6, 0, 8, 0, 1, 2, 0, 9, 51, 0, 45 };

		// o/p : {7, 5, 6, 8, 1, 2, 9, 51, 45, 0, 0, 0, 0, 0};

		// Move zeros to right
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[index] = array[i];
				index++;
			}
		}
		// fill remaining posistions with zero
		for (int i = index; i < array.length; i++) {
			array[i] = 0;
		}
		// System.out.println(Arrays.toString(array));

		// using stream Api
		int[] result = IntStream.concat(Arrays.stream(array).filter(n -> n != 0), Arrays.stream(array).filter(n -> n == 0)).toArray();
		System.out.println(Arrays.toString(result));
	}

}
