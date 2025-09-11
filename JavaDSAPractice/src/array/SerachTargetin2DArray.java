package com.array;

import java.util.Arrays;

public class SerachTargetin2DArray {
	public static void main(String[] args) {
		int[][] arr= {{2, 3, 4, 7, 8, 4, 54, 65},
				{55, 76, 887, 443, 67 ,54, 44},
				{43, 55, 64, 74, 34}};
		int target=67;
		int ans[]=isPresent(arr, target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] isPresent(int[][] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					int tem=arr[i][j];
				return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}

}
