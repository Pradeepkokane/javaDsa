package com.Pattern;

public class rotedHalfNumberPyramid {
	public static void main(String[] args) {
		int size=4;
		starPrint(size);
	}
	static void starPrint(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
