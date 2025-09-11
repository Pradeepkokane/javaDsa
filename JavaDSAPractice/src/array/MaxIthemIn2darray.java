package com.array;

public class MaxIthemIn2darray {
	public static void main (String[] args) {
		int[][] arr= {{22, 5, 54, 67, 44, 334, 76,443 },
				{44, 66, 88,54,43},
				{44,34,67,760,4,32,32,56}};
		System.out.println(MaxValue(arr));
	}
	static int MaxValue(int[][] arr) {
		int tem=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>tem) {
					tem=arr[i][j];
					
				}
			}
		}
		return tem;
	}

}
