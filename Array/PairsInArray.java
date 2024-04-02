public class PairsInArray {
	public static void printPairs(int arr []) {
		int tp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1+i; j<arr.length; j++) {
				System.out.print("("+arr[i] + "," + arr[j]+ ") ");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs: "+ tp);
	}
	public static void main (String args []) {
		int arr [] = {2, 4, 6, 8, 10};
		printPairs(arr);
	}
}