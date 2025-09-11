package com.array;

public class MinNumberOfArray {
	public static void main (String[] args) {
		int[] arr= {10, 34, 56, 43, 6, 76, 10 };
		System.out.println(minNumber(arr));
		
	}
	static int minNumber(int[] arr) {
		int tem=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<tem) {
				tem=arr[i];
			}
		}
		return tem;
	}

}
