import java.util.Scanner;

public class DigitSum {
	public static int getSumOfDigit(int n) {
		int sum = 0;
		for(int i = 0; i<n;) {
			sum  = sum + (n%10);
			n = n / 10;
		}
		return sum;
	}
	
	public static void main(String args [] ) {
		System.out.println(getSumOfDigit(123));
	}
}