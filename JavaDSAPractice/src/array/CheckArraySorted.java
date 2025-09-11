package com.array;

public class CheckArraySorted {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int start=0;
		int end=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr.length-1) {
				System.out.println("sorted Array");
			}else {
				System.out.println("not Sorted");
			}
		}

	}

}
