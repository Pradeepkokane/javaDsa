package com.array;

public class ValuePresent {
	public static void main(String []args) {
		int[] arr= {10, 20, 30, 40, 30,3};
		int target=40;
		boolean isPresent=false;
		for(int num:arr) {
			if(num==target) {
				isPresent=true;
				break;
			}
		}
		System.out.println(isPresent);
	}

}
