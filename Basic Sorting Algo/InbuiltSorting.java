import java.util.Arrays;
public class InbuiltSorting {
	public static void printArray (int arr []) {
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("[");
			}
			System.out.print(arr[i]+" ");
			if(i==arr.length-1) {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	public static void main(String args []) {
		int arr [] = {13,12, 18, 9, 7,1, 8,2,};
		Arrays.sort(arr, 4, arr.length);
		printArray(arr);
	}
}