package com.Binarysearching;

public class PeakOfMountainArray {
	public static void main(String[] args) {
		int[] arr= { 0,10,12,44,3,2,1};
		int index=mountain(arr);
		System.out.println(index);
		
	}
	
	static int mountain(int[] arr) {
	int start=0;
	int end=arr.length-1;
	while(start< end) {
		int mid = start+ (end-start)/2;
		
		if(arr[mid]>arr[mid+1]) {
			end=mid;
		}else {
			start=mid+1;
		}
		
	}
	return start;
	
	
	}
	

}
