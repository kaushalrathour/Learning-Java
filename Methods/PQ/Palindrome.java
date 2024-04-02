import java.util.Scanner;
import java.lang.Integer;
public class Palindrome {
	//Code By Mam
	/* public static boolean isPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;
		while (palindrome != 0) {
		int remainder = palindrome % 10;
		reverse = reverse * 10 + remainder;
		palindrome = palindrome / 10;
}
			if (number == reverse) {
				return true;
			}
		return false;
} */

public static int getReverse (int n) {
	String str = "";
	for(int i = 0; i<n;) {
		int rem = n % 10;
		str  = str + (n %10);
		n = n / 10;
	}
	return Integer.parseInt(str);
}

public static boolean isPalindrom(int n) {
	return getReverse(n) == n?true:false;
}

	
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = scanner.nextInt();
		System.out.println(isPalindrom(n));
	}
}