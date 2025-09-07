package com.Binarysearching;

public class RotetedArrayCount {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 3, 2, 1 };
		int count = count(arr);
		System.out.println(count);

	}

	static int count(int[] arr) {
		int pivot = findpivot(arr);
		if (pivot == -1) {
			return -1;
		}
		return pivot + 1;

	}

	private static int findpivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}else if(mid<start &&arr[mid]<arr[mid-1]) {
				return mid-1;
			}else if(arr[start]>arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}

		}
		return -1;
	}
}