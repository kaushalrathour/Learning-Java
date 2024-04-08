public class DiagonalSum {
	public static int diagonalSum(int arr [] []) {
		if(arr.length != arr[0].length) return -1;
		int n = arr.length;
		int sum = 0;
		/*int primary = 0;
		int secondary = n-1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(j==primary || j == secondary) {
					sum += arr[i][j];
				}
			}
				secondary--;
				primary++;
		}
		return sum*/
		for(int i = 0; i<n; i++) {
			sum += arr[i][i];
			sum += arr[i][n-i-1];
		}
		return sum;
	}
	public static void main (String args []) {
		int matrix [][] = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
		System.out.println("Diagonal Sum: "+diagonalSum(matrix));
	}
}