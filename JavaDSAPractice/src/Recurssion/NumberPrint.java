package Recurssion;

public class NumberPrint {
	public static void main(String[] args) {
		print(1);
	}

	static void print(int n) {
		System.out.println(n);
		if(n==5) {
			return;
		}
		print(n+1);
	}

	
}
