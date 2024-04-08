public class CountNIn2D {
	public static int countNIn2D(int arr [] [], int key) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(key == arr[i][j]){
					sum++;
				}
			}
		}
		return sum;
	}
	public static void main (String args []) {
		int matrix [] [] = {
			{4, 7, 8},
			{8, 8, 7}
		};
		System.out.println(countNIn2D(matrix,7));
	}
}