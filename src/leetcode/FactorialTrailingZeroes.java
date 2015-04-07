package leetcode;

public class FactorialTrailingZeroes {

	public static int trailingZeroes(int n) {
		long count = 0;
		for (long i = 5; n / i >= 1; i = i * 5) {
			count += n / i;
		}
		return (int) count;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = trailingZeroes(55);
		Util.print("The result is: " + result);
	}
}
