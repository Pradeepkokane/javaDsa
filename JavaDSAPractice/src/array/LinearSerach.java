package com.array;

public class LinearSerach {
	public static void main(String[] args) {
		int[] arr= {18, 12, -3, 7, 14, 28};
		int target=7;
		int start=1;
		int end=4;
		
		int index=isPresent(arr,target,start,end);
		if(index==-1) {
			System.out.println("item not found");
		}else {
		System.out.println(index);
		}
		
	}
	static int isPresent(int[] arr, int target, int start, int end) {
		for(int i=start;i<=end ; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		if(arr.length==0) {
			return -1;
		}
		return -1;
	}

}
