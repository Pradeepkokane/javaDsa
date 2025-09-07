package com.NumberSystem;

public class BinaryEvenOddNumber {
public static void main(String[] args) {
	int n=77;
	System.out.println(isOdd(n));
}

private static boolean isOdd(int n) {
	return (n & 1) == 1;
}	

}
