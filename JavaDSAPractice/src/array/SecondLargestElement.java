package com.array;

import java.util.Arrays;

public class SecondLargestElement {
	
	public static void main (String []args) {
		int[] arr = {10, 20, 4, 45, 99};
		int LargestValue=Integer.MIN_VALUE;
		int SecondLargestValue=Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num>LargestValue) {
				SecondLargestValue=LargestValue;
				LargestValue=num;
			}
			if(num>LargestValue && num!= SecondLargestValue) {
				SecondLargestValue=num;
			}
		}
		if(LargestValue==SecondLargestValue) {
			System.out.println("no second largest value");
		}if(LargestValue>SecondLargestValue) {
			System.out.println("SecondLargestValue "+ SecondLargestValue);

		}
	}

}
