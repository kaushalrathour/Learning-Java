public class Triplets {
	public static void triplets(int arr []) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; i<arr.length; j++) {
				for(int k = 0; k<arr.length; k++) {
					if((i!=k && i!=j && j!=k) && arr[i]+arr[j]+arr[k]== 0) {
						System.out.print(arr[j]);
					}
				}
			}
		}
	}
	public static void main (String args []) {
		int arr [] = {-1, 0, 1, 2, -1, -4};
		triplets(arr);
	}
}