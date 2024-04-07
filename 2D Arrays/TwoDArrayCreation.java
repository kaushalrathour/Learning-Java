import java.util.Scanner;
public class TwoDArrayCreation {
	public static void inputIn2DArray (int arr[] []) {
		// 0 Becuase Each Row Having Same Length
		int n = arr.length, m = arr[0].length;
		Scanner scanner = new Scanner(System.in); 
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.print("Input "+i+ ", "+ j +" Element: " );
				arr[i][j] = scanner.nextInt();
			}
		}
	}
	
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
	
	public static void main (String args []) {
		int metrix [][] = new int[4][3];
		// Taking Input In 2D Array
		inputIn2DArray(metrix);
		
		//Printing 2D Array 
		print2DArray(metrix);
		
	}
}