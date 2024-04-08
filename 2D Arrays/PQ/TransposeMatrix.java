public class TransposeMatrix {
	public static void print2DArray(String arr [] [] ) {
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
	public static String [] [] transposeMatrix (String arr [] []) {
		String transpose [][] = new String [arr[0].length][arr.length];
		for(int i = 0; i<transpose.length; i++) {
			for(int j = 0; j<transpose[i].length; j++) {
				transpose[i][j] = arr[j][i];
			}
		}
		return transpose;
	}
	public static void main (String args []) {
		String matrix [] [] = {
			{"2" , "3", "7"},
			{"5", "3", "7"}
		};
		print2DArray(transposeMatrix(matrix));
	}
}