import java.util.Scanner;
class BinaryToDecimal {
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
	/*public static void binaryToDecimal(int n) {
		int sum = 0;
		int counter = 0;
		for(int i = 0; i<n;) {
			int pow = getPower(2, counter);
			pow = pow*(n%10);
			sum = sum + pow;
			n /= 10;
			counter++;
		}
		System.out.println(sum);
	} */
	
	public static int binaryToDecimal(int n) {
		int decimal = 0;
		int counter = 0;
		for(int i = 0; i<n;) {
			decimal = (getPower(2, counter)*(n%10))+decimal;
			n /= 10;
			counter++;
		}
		return decimal;
	}
	
	public static void main(String args []) {
		// System.out.println(getPower(9, 1));
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Binary Number: ");
		int n = scanner.nextInt();
		int decimal = binaryToDecimal(n);
		System.out.println("Decimal: "+decimal);
	}
}