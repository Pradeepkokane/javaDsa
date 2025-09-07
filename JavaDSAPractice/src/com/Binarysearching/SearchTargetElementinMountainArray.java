package com.Binarysearching;

public class SearchTargetElementinMountainArray {
	public static void main(String[] args) {
		int[] arr = { 1,3,5,7,9,8,7,6,5,4,3,2,1,0};
		int target=2;
		int index=search(arr, target);
		System.out.println(index);
		
	}
	
	static int search(int[] arr,int target) {
		int largest=LargestElement(arr);
		
		int assending=index(arr, target, 0, largest);
		int desending=index(arr, target, largest+1, arr.length-1);
		if(assending !=-1) {
			return assending;
		}else if(desending != -1)	{
			return desending;
		}
			
	return -1;
		
	}
	static int LargestElement(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start< end) {
			int mid= start+ (end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else {
				
				start=mid+1;
			}
			
		}
		return start;
		
	}
	static int index(int[] arr,int target, int start,int end) {
		
		while(start<=end) {
			int mid= start+ (end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				start=mid+1;
			}else {
				
				end=mid-1;
			}
		}
		return -1;
		
	}
}
