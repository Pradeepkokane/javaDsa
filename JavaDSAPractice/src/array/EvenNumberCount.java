package com.array;

public class EvenNumberCount {
	public static void main(String[] args) {
		int[] arr= {12,345,2,6,7896};
		System.out.println(checkEven(arr));
		
	}
	static int checkEven(int[] arr) {
		int even=0;
		for(int num:arr) {
			if(num %2==0) {
				even++;
			}
		}
		return even;
	}

}
