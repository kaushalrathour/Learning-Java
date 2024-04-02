import java.lang.Integer;

public class MaxInSubArray {
	public static void maxInSubArraySum (int arr []) {
		int ts = 0;
		for(int i = 0; i<arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for(int j=0; j<arr.length; j++) {
				int sum = 0;
				for(int k = i; k<=j; k++) {
					if(k==i) {
						System.out.print("[ ");
					}
					System.out.print(arr[k]+", ");
					sum = sum + arr[k];
					if (k==j) {
						ts++;
						System.out.print("] ");
						System.out.println("Sum: "+sum);
					}
					
				}
					max = max<sum? sum : max;
					if(j==(arr.length-1)) {
					System.out.println("Max: "+max);
					}
			}
			
			System.out.println();
			
		}
		System.out.println("Total Sub Arrays: "+ ts);
	}
	public static void main (String args []) {
		int arr [] = {1, -2, 6, -1, 3};
		maxInSubArraySum(arr);
	}
}


/* Code Based On What I Think and Upper Code Is Based problem which mam gave us

import java.lang.Integer;

public class MaxInSubArray {
	public static void maxInSubArraySum (int arr []) {
		int ts = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				int sum = 0;
				for(int k = i; k<=j; k++) {
					if(k==i) {
						System.out.print("[ ");
					}
					System.out.print(arr[k]+", ");
					sum = sum + arr[k];
					if (k==j) {
						ts++;
						System.out.print("] ");
						System.out.println("Sum: "+sum);
					}
					
				}
					max = max<sum? sum : max;
					
			}
			
			System.out.println();
			
		}
		System.out.println("Max: "+max);
		System.out.println("Total Sub Arrays: "+ ts);
	}
	public static void main (String args []) {
		int arr [] = {1, -2, 6, -1, 3};
		maxInSubArraySum(arr);
	}
}
*/