package com.Pattern;

public class Rectangle {
	public static void main(String[] args) {
		int size = 3;
		startPrint(size);

	}

	static void startPrint(int size) {
		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
