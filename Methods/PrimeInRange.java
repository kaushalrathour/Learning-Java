import java.util.Scanner;

class PrimeInRange {
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		//If Num == 2 It Will Never Be Execute
		return true;
	}
	
	public static void PrimeInRange(int start, int end) {
		if(start>=end) {
			System.out.println("The Starting Range Should Be Greater Than Ending");
		}else { for(int i = start; i<=end; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
			System.out.println();
		}
	}
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the starting range: ");
		int range_start = scanner.nextInt();
		System.out.print("Input the ending range: ");
		int range_end = scanner.nextInt();
		PrimeInRange(range_start, range_end);
	}
}