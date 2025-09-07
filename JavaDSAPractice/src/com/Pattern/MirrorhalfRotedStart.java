package com.Pattern;

public class MirrorhalfRotedStart {
	public static void main(String[] args) {
		int size=4;
		starPattern(size);
	}

	private static void starPattern(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=size-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
