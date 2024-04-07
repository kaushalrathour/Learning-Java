public class BubbleSorting {
	public static void printArray (int arr []) {
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("[");
			}
			System.out.print(arr[i]);
			if(i==arr.length-1) {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	
	// Method For Increasing Order 
	public static void increasing (int arr []) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<(n-1)-i; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
		// Increasing Order End
		
	//Method For Decreasing Order
		public static void decreasing (int arr []) {
			int n = arr.length;
			for(int i = 0; i<n-1; i++) {
				for(int j = 0; j<(n-1)-i; j++) {
					if(arr[j] < arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
	//Decreasing Order End
	public static void bubbleSorting (int arr [], String sort) {
		if(sort == "Decreasing" || sort == "decreasing" || sort == "dec" || sort == "Dec") {
			decreasing(arr);
		}
		else if(sort == "Increasing" || sort == "increasing" || sort == "inc" || sort == "Inc") {
			increasing(arr);
		}
		else {
			System.out.println("Please Input Valid Order For Sorting");
			
		}
	}
	
	
	
	public static void main (String args []) {
		int arr [] = {8, 1,2, 3, 4, 5, 6, 7};
		int arr2 [] = {1, 8, 7, 6, 5, 4, 3, 2};
		System.out.print("Array Before Sorting: ");
		printArray(arr);
		bubbleSorting(arr, "dec");
		//bubbleSorting(arr2, "inc");
		System.out.print("Array After Sorting: ");
		printArray(arr);
	}
}