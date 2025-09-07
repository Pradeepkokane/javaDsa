package com.Binarysearching;

public class FloorOfNumberSearch {
	public static void main(String[] args) {
		int[] arr= { 2,4, 5,6,8,12,23,34,45,56,67,78};
		int target= 44;
		int index=floorNumber(arr, target);
		System.out.println(arr[index]);
		
	}
	
	static int floorNumber(int[] arr, int target) {
		int start=0;
		int end= arr.length-1;
		
		while (start<=end) {
			int mid = start+ (end-start) /2;
			
			if(arr[mid]== target) {
				return mid;
			}
			else if(arr[mid] < target) {
				start= mid+ 1;
			}
			else {
				end= mid-1;
			}
		}
		return end;
			
			
	}

}
