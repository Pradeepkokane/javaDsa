package com.array;

public class SerachIn2DArray {
	public static void main(String[] args) {
		int[][] arr= { 
				{2, 3, -55, 7, 8},
				{3, 4, 6, -8, 9},
				{1, 2, 85, -0, -3}};
		System.out.println(isPresent(arr));
	}
	
	static int isPresent(int[][] arr) {
		int tem=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<tem) {
					tem=arr[i][j];
				}
			}
		}
		return tem;
	}

}
