public class SubArray {
	public static void printSubArrays (int arr []) {
		int ts = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				//int sum = 0;
				for(int k = i; k<=j; k++) {
					if(k==i) {
						System.out.print("[ ");
					}
					System.out.print(arr[k]+", ");
					//sum = sum + arr[k];
					if (k==j) {
						ts++;
						System.out.print("] ");
						//System.out.println("Sum: "+sum);
					}
					
				}
			}
			
			System.out.println();
			
		}
		System.out.println("Total Sub Arrays: "+ ts);
	}
	public static void main (String args []) {
		int arr [] = {2, 4, 6, 8, 10};
		printSubArrays(arr);
	}
}