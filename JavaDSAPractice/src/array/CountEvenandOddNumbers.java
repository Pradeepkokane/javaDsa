package com.array;

public class CountEvenandOddNumbers {
	
	public static void main(String []args1) {
		int[] arr= {2, 5, 7, 8, 10, 3};
		
		int even=0;
		int odd=0;
		
		for (int num:arr) {
			if(num % 2==0) {
				even++;
			}else {
				odd++;
			}
			
		}
		System.out.println("even "+even);
		System.out.println("odd "+odd);
	}

}
