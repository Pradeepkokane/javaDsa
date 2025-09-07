package com.NumberSystem;

public class BinaryUniqueValueInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6,6,7, 5, 4, 2, 5 };
		System.out.println(isUnique(arr));
	}

	private static int isUnique(int[] arr) {
		int unique=0;
		for(int n: arr) {
			unique ^=n;
		}
		return unique;
	}

	
}
