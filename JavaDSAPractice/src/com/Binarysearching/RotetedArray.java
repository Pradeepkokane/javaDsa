package com.Binarysearching;

public class RotetedArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9, 0, 1, 2, 3 };
		int target= 5;
		int index=index(arr, target);
		System.out.println(index);

	}

	static int index(int[] arr, int target) {
		int pivot = findPivot(arr);

		if (pivot == -1) {
			return binarySearch(arr, target, 0, arr.length-1);
		}
		if (arr[pivot] == target) {
			return pivot;
		}
		if(target>=arr[0]) {
			return binarySearch(arr, target, 0, pivot-1);
		}
		return binarySearch(arr, target, pivot +1 , arr.length-1);

	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		

		while(start<=end) {
			int mid = start + (end - start) / 2;// middle value

			if (arr[mid] == target) {
				return mid; // if element is present break the loop
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1; // if element is not present
	}

	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid; 
			}
			if (start <= mid &&arr[start] > arr[mid]) {
				end = mid - 1;
			}
			if (mid <end && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
