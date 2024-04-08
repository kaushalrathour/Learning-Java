public class SearchInSortedMatrix {
	public static boolean searchInSortedMatrix(int arr[][], int key) {
		int n = arr.length, m = arr[0].length;
		// Binary Search
		/*for(int i = 0; i<n; i++) {
			int start = 0, end = m-1;
			while(start <= end) {
				int mid = (start + end) / 2;
				if(key == arr[i][mid]) {
					System.out.println("Found At: "+ "I = "+i + ", J: " + mid);
					return true;
				}
				if(key > arr[i][mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}
		}
		 
		System.out.println("Key Not Found!");
		return false; */
		
		// StairCase Search
		int row = 0, col = arr[0].length-1;
		while(row < arr.length && col>=0) {
			if(arr[row][col] == key) {
				System.out.println("Found At: "+ "I = "+row + ", J: " + col);
				return true;
			}else if(key < arr[row][col]) {
				col--;
			}else {
				row++;
			}
			
		}
		return false;
	}
	public static void main (String args []) {
		int matrix[][] = {
			{10, 20, 30, 40},
			{15, 25, 35, 45},
			{27, 29, 37, 48},
			{32, 33, 39, 50},
		};
		searchInSortedMatrix(matrix, 27);
	}
}