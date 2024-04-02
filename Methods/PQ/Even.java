import java.util.Scanner;
public class Even {
	// Function Definition
	public static boolean isEven(int n) {
		boolean res = (n%2)==0?true : false;
		return  res;
	}
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input First Number: ");
		int n = scanner.nextInt();
		// Function Call
		System.out.println(isEven(n));
	}
}