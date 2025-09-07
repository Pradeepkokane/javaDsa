package com.Binarysearching;

public class InfiniteArray {
	public static void main(String[] args) {
		int[] arr = {3,4,6,7,9,11,23,34,56,35,36,37,37,37,37,37,37,37,37,37,45,67,78,89,100};
		int target= 9;
		int index=ans(arr, target);
		System.out.println(index);
	}
	
	static int ans(int[] arr, int target) {
		
		int start= 0;
		int end= 1;
		
		while(arr[end]<target) {
			int newStart= end + 1;
			end = end+ (end-start +1)*2;
			start= newStart;
		}	
		return binarySearch(arr, target, start, end);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
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
