public class SpiralMatrix {
	public static void print2DArray(int arr [] [] ) {
		// 0 Becuase Each Row Having Same Length
		int n = arr.length, m = arr[0].length;
		for(int i = 0; i<n; i++) {
			System.out.print("[");
			for(int j = 0; j<m; j++) {
				if(j== m-1) {
					System.out.print(arr[i][j]);
				}else {
				System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println("]");
		}
	}
	
	public static void printSpiralMatrix(int arr [] []) {
		int n = arr.length, m = arr[0].length;
		int startRow = 0, startCol = 0, endRow = n-1, endCol = m-1;
		while(endRow >= 0 && endCol >= 0) {
			for(int j = startRow; j<=endCol; j++) {
				System.out.print(arr[startRow][j]+ " ");
			}
			for(int i = startRow+1; i<=endRow; i++) {
				System.out.print(arr[i][endCol]+" ");
			}
			for(int j = endCol-1; j>startCol; j--) {
				System.out.print(arr[endRow][j]+" ");
			}
			for(int i = endRow; i>startRow; i--) {
				System.out.print(arr[i][startCol]+" ");
			}
			startCol++;
			startRow++;
			endRow--;
			endCol--;
		} 
	}
	public static void main (String args []) {
		int matrix [][] = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
		printSpiralMatrix(matrix);
		//print2DArray(matrix);
}
}