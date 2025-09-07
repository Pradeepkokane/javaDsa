package MathFunction;

public class SqaureRootUsingBinaryNumber {
	public static void main(String[] args) {
		int n = 25;
		System.out.println(sqareRoot(n));
	}

	static double sqareRoot(int n ) {
		int start = 0;
		int end = 40;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid * mid == n) {
				return mid;
			}
			if (mid * mid < n) {
				start = mid + 1;

			} else {
				end = mid - 1;

			}

		}
		return -1;

	}

}
