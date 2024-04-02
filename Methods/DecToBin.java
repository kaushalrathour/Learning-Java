import java.util.Scanner;
import java.lang.Integer;

class DecToBin {
	public static int getPower(int n, int pow) {
		int result = 1;
		if(pow == 0) {
			return 1;
		}
		for(int i = 1; i<=pow; i++) {
			result *= n ;
		}
		return result;
	}
	public static int decToBin(int n) {
		int bin = 0;
		int counter = 0;
		if(n== 1) {
			return 01;
		}
		for(int i = 0; i<n;) {
			int rem = n % 2;
			bin = bin + rem * getPower(10, counter);
			counter ++;
			n  = n / 2;
		}
		return bin;
	}
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Decimal Number: ");
		int n = scanner.nextInt();
		System.out.println(decToBin(n));
	}
}