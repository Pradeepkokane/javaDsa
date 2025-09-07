package com.Binarysearching;


// ceiling the number means the smallest number and greatest or equal number of target
public class CeilingNumberSearch {

	public static void main(String[] args) {
		int[] arr= { 2,3,5,7,9,11,23,45,56,74,86};
		int target= 13;
		int index=ceiling(arr, target);
		System.out.println(arr[index]);
	}
	
	static int ceiling(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid= start+(end-start) /2;
			
			if(arr[mid] == target) {
				return mid;
			}else if( arr[mid] < target) {
				start = mid+1;
			}else {
				end=mid-1;
			}
		}
		//start= end+1;
		
		return start;
		
		
	}

}
