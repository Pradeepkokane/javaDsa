package com.array;

public class PalinndromArray {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 2, 1};
		int start=0;
		int end=arr.length-1;
		boolean isPalindron=true;
		for(int i=0;i<end;i++) {
			if(arr[start]!=arr[end]) {
				isPalindron=false;
			}else {
				isPalindron=true;
			}
			start++;;
			end--;
		
		}
		System.out.println(isPalindron);
		
	}

}
