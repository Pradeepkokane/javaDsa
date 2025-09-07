package com.Pattern;

public class halfPyramid {
	public static void main(String[] args) {
		int size=4;
		starPrint(size);
	}

	private static void starPrint(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=size;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
