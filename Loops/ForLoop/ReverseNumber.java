package ForLoop;
import java.util.Scanner;
import java.lang.Integer;

public class ReverseNumber {
	
	public static int reverse(int n) {
		String str = "";
		if(n==0) {
			return n;
		}else {
		for(int i = 0; i<n;) {
			str += n%10;
			n /=10;
		}
		int reverse = Integer.parseInt(str);
		return reverse;
	}
	}
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input A Number: ");
		int n = scanner.nextInt();
		System.out.println(reverse(n));
		}
}
