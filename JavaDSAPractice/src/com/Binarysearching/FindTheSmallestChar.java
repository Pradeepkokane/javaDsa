package com.Binarysearching;

// find the smallest charecter greater then target char;

public class FindTheSmallestChar {
	public static void main(String[] args) {
		char[] arr= {'a', 'b', 'd', 'f', 'y'};
		char target = 'f';
		char index= ceilingChar(arr, target);
		System.out.println(index);
	}
	
	
	static char ceilingChar(char[] arr, char target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid = start+ (end-start) /2;
			
			if(arr[mid] > target) {
				end = mid-1;			
			}
			else {
				start = mid+1;	
			}
			
			
		}
		
		
	return arr[start % arr.length];
	}

}
