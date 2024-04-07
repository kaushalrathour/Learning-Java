public class PracticeQuestion {
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
	
	public static void bubbleSort (int arr []) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void selectionSort (int arr []) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			int maxPosition = i;
			for(int j = i+1; j<n; j++) {
				if(arr[maxPosition] < arr[j]) {
					maxPosition = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxPosition];
			arr[maxPosition] = temp;	
		}
	}
	
	public static void main (String args []) {
		int arr [] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
		//bubbleSort(arr);
		selectionSort(arr);
		printArray(arr);
	}
}