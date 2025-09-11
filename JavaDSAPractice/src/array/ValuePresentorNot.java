package com.array;

public class ValuePresentorNot {
	public static void main(String[] args) {
		int[] arr= {1,3,5,3,6,3};
		int target=6;
		System.out.println(SortedArray(arr, target));
		
	}
	
	static int SortedArray(int[] num,int target) {
		
		for(int i=0;i<num.length;i++) {
			if(num.length==0) {
				return -1;
			}
			if(num[i]==target) {
				return i;
			}
			
		}
		
		return -1;
	}

}
