package com.Binarysearching;

public class SortedArraySearch {
	public static void main(String[] args) {
		int[] arr= {99,98,87,76,65,54,43,32,21,11,6,4,2};
		int index=binarySearch(arr, 11);
		System.out.println(index);
		
		
	}

	static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			boolean isAsn=arr[start]< arr[end];
			
			int mid= start + (end - start) / 2;// middle value
			
			if(arr[mid]== target) {
				return mid; // if element is present break the loop
			}
			if(isAsn) {
				if(arr[mid]< target) {
					start= mid+1;				
				}else {
					end= mid-1;
				
				}
			}
			else {
				if(arr[mid]> target) {
					start= mid+1;				
				}else {
					end= mid-1;
				}
			}	
			 
			
		}		
		return -1;
	}
}