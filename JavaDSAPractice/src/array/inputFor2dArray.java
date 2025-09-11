package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class inputFor2dArray {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] rNo=new int[4][3];
		
		for(int row=0;row<rNo.length;row++) {
			for(int col=0; col < rNo[row].length ;col++) {
				rNo[row][col] =sc.nextInt();
			}
		}
		for(int row=0;row<rNo.length;row++) {
			for(int col=0; col < rNo[row].length ;col++) {

				System.out.print(rNo[row][col]+" ");
			}
			System.out.println();
		}
		
		
	}

}
