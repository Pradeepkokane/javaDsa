package com.array;

import java.util.Arrays;

public class StoreRollNumber {
	public static void main(String[] args) {
		int[] rollNumber= {2,3,4,5,6};
		for(int i=0;i<rollNumber.length;i++) {
			System.out.print(rollNumber [i]);
		}
		System.out.println();
		for (int num: rollNumber) {
			System.out.print(num);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(rollNumber ));

		
	}
	

}
