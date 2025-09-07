package com.Pattern;

public class ReverseHalfPyramid {
	public static void main(String[] args) {
		int size=4;
		startPrint(size);
	}
	static void startPrint(int size) {
		for(int i=size;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
