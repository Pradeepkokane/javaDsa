package com.Binarysearching;

public class SearchElementInSortedArray {
	public static void main(String[] args) {
		
		int[] arr= { 2,4,9,10,12,14,18,19};
		int target=14;
		int index=binarySearch(arr, target);
		System.out.println(index);
		
	}
	// return index
	static int binarySearch(int[] arr, int target) {
		int start=0;	
		int  end=arr.length;// assign length of the array
		
		for(int i=start; i< end; i++) {
			int mid= start + (end - start) / 2;// middle value
			
			if(arr[mid]== target) {
				return mid; // if element is present break the loop
			}else if(arr[mid]< target) {
				start= mid+1;				
			}else {
				end= mid-1;
			}
		}
		return -1; //  if element is not present
	}
}
