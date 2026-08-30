package com.mad.tech;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosLeft {
	public static void main(String[] args) {
		int[] array = { 7, 0, 5, 6, 0, 8, 0, 1, 2, 0, 9, 51, 0, 45 };
		            // O/P : {0, 0, 0, 0, 0, 7, 5, 6, 8, 1, 2, 9, 51, 45}

		// Move none zeros to left
		int index = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[index] = array[i];
				System.out.println(array[index]);
				index--;
			}
		}
		// fill remaining positions with zero
		for (int i = 0; i <= index; i++) {
			array[i] = 0;
		}

		System.out.println(Arrays.toString(array));

		// using stream Api
		int[] result = IntStream.concat(Arrays.stream(array).filter(num -> num == 0), Arrays.stream(array).filter(num -> num != 0)).toArray();
		System.out.println(Arrays.toString(result));
	}
}
