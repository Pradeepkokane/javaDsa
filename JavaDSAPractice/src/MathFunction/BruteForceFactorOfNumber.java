package MathFunction;

public class BruteForceFactorOfNumber {
	public static void main(String[] args) {
		factor(20);
		
	}
	static void factor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
