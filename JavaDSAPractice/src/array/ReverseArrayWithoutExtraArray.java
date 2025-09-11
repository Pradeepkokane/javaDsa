package com.array;

public class ReverseArrayWithoutExtraArray {
	public static void main(String[] args) {
	
	
    int[] arr = {1, 2, 3, 4, 5};

    int start=0;
    int end=arr.length-1;
    while(start<end)
    {
    int tem=arr[start];
    arr[start]=arr[end];
    arr[end]=tem;
    start++;
    end--;
    }
    System.out.println("revese array");

    for(int num:arr) {
    	System.out.print(num);
    }
}
}
