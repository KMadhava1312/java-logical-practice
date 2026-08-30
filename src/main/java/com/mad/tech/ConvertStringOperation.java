package com.mad.tech;

import java.util.Arrays;

public class ConvertStringOperation {

	public static void main(String[] args) {

		String input = "hello java world";

		// Using for loop
		String[] words = input.split(" ");

		StringBuilder result = new StringBuilder("#");

		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
		}

		System.out.println("For Loop  : " + result);

		// Using Streams
		StringBuilder result1 = new StringBuilder("#");

		Arrays.stream(input.split(" ")).forEach(word -> result1.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)));

		System.out.println("Streams    : " + result1);
	}
}