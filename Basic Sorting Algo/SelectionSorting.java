public class SelectionSorting {
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
	public static void increasing(int arr []) {
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			int minPosition = i;
			for(int j = i+1 ; j<n; j++) {
				if(arr[minPosition] > arr[j]) {
					minPosition = j;
				}
			}
			System.out.println("Min:"+minPosition);
			int temp = arr[minPosition];
			arr[minPosition] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void decreasing(int arr []) {
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			int maxPosition = i;
			for(int j = i+1 ; j<n; j++) {
				if(arr[maxPosition] < arr[j]) {
					maxPosition = j;
				}
			}
			int temp = arr[maxPosition];
			arr[maxPosition] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public static void main (String args []) {
		int arr [] = {8,1,1, 8,2, 3, 4, 5, 6, 7};
		increasing(arr);
		printArray(arr);
	}
}