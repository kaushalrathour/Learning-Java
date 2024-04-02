public class ReverseArray {
	/* public static int [] reverse (int arr []) {
		int last = arr.length;
		for(int i = 0; i<last; i++) {
			int f_value = arr[i], l_value = arr[last-1];
			arr[i] = l_value;
			arr[last-1] = f_value;
			last--;
		}
		return arr;
	} */
	
	public static int [] reverse (int arr []) {
		int last = arr.length;
		for(int i = 0; i<last; i++) {
			int temp = arr[i];
			arr[i] = arr[last-1];
			arr[last-1] = temp;
			last--;
		}
		return arr;
	} 
	public static void main (String args []) {
		int arr [] = {15, 12, 42, 75, 36, 78};
		reverse(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");

		}
		
	}
}