package MathFunction;

import java.util.ArrayList;

public class FactorOptimized {
	public static void main(String[] args) {
		factor(20);
		
	}
	static void factor(int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(i==n/i) {
					System.out.println(i+" ");
				}else {
					System.out.print(i+" ");
					list.add(n/i);
				}
			}
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+ " ");
		}
	}

}
