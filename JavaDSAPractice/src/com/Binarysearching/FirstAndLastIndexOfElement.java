package com.Binarysearching;

import java.util.Arrays;

public class FirstAndLastIndexOfElement {
	public static void main(String[] args) {
		int[] arr= { 2,4,6,7,7,7,7,7,8};
		int target=7;
		int[] index=FirstAndLastIndex(arr, target);
		
		System.out.println(Arrays.toString(index));
		
	}
	
	static int[] FirstAndLastIndex(int[] arr, int target) {
		int[] ans = {-1,-1};
		int start= search(arr,target,true);
		int end= search(arr,target,false);
		ans[0]=start;
		ans[1]=end;
		
		return ans;
	}

	static int search(int[] arr, int target, boolean b) {
		int ans=-1;
		int start = 0;
		int end = arr.length-1;
		
		while (start<= end) {
			int mid= start+ (end- start)/2;
			if(arr[mid]> target) {
				end= mid-1;
				
			}else if(arr[mid]< target) {
				start= mid+ 1;
			}else {
				ans=mid;
				if(b) {
					end = mid-1;
				}else {
					start=mid +1;
				}
			}
			
		}
		
		return ans;
	}

}
