package com.Pattern;

public class HalfPyramidrRoted {
	public static void main(String[] args) {
		int size=5;
		starPrint(size);
		
	}
	static void starPrint(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int j=size-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
