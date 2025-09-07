package com.NumberSystem;

public class MagicNumber {
	public static void main(String[] args) {
		int n=3;
		int ans=0;
		int base=2;
		
		while(n>0) {
			int last=n&1;
			n=n>>1;
			ans += last*base;
			base=base*2;
		}
		System.out.println(ans);
		System.out.println(base);
		System.out.println(125*5);
	}

}
