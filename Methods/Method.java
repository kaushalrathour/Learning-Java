import java.util.Scanner;
public class Method {
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static int multiply(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int binominal_coefficient(int n, int k) {
		int fact_n = factorial(n);
		int fact_k = factorial(k);
		int fact_nk = factorial(n-k);
		int nck = fact_n / (fact_k * fact_nk);
		return nck;
	}
	
	/* public static boolean isPrime(int num) {
		boolean isPrime = true;
		if(num<2) {
			isPrime = false;
		}
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	} */
	
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		//If Num == 2 It Will Never Be Execute
		return true;
	}
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a = scanner.nextInt();
		//System.out.print("Input the second number: ");
		//int b = scanner.nextInt();
		
		// int sum = sum(a, b);
		// System.out.println("Sum is: "+sum);
		
		// int product = multiply(a, b);
		// System.out.println("Product Of A & B Is : "+product);
		
		//int factorial = factorial(a);
		//System.out.println("Factorial Is : "+factorial);
		
		// int nck = binominal_coefficient(a, b);
		// System.out.println("Binominal Coefficient Is: "+ nck);
		boolean isPrime = isPrime(a);
		System.out.println(isPrime);
	}
}