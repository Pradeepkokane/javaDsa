package Recurssion;

public class Fibo {
	public static void main(String[] args) {
		int size=4;
		int ans= fib(size);
		System.out.println(ans);
		
	}
	
	static int fib(int n) {
		if(n<2) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}

}
