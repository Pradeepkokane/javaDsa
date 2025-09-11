package com.array;

public class SecondLargestValue2 {

	public static void main(String[] args) {

		int []arr = {10, 20, 4, 45, 99};
		
		int largestValue=Integer.MIN_VALUE;
		int secondLargestValue=Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num>largestValue) {
				secondLargestValue=largestValue;
				largestValue=num;
			}
			if(num>largestValue && num!= largestValue) {
				secondLargestValue=num;
			}
		}
		if(secondLargestValue==Integer.MIN_VALUE) {
			System.out.println("no secondLargestValue");
		}else {
			System.out.println(secondLargestValue);
		}

	}

}
