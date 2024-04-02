import java.util.Scanner;
public class Average {
	// Function Definition
	public static float findAverage(int a, int b, int c) {
		return  (float)(a+b+c)/3;
	}
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input First Number: ");
		int a = scanner.nextInt();
		System.out.print("Input Second Number: ");
		int b = scanner.nextInt();
		System.out.print("Input Third Number: ");
		int c = scanner.nextInt();
		// Function Call
		System.out.println(findAverage(a, b, c));
	}
}