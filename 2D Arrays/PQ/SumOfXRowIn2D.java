public class SumOfXRowIn2D {
	public static int sumOfXRowIn2D (int arr [] [], int x) {
		int sum = 0;
		x--;
		for(int j = 0; j<arr[x].length; j++) {
			sum += arr[x][j];
		}
		return sum;
	}
	public static void main (String args []) {
		int matrix[][] = {
			{1, 4, 9},
			{11, 4, 3},
			{2, 2, 3},
		};
		System.out.println(sumOfXRowIn2D(matrix, 2));
		
	}
}