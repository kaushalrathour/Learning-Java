public class DuplicateValue {
	public static boolean duplicatevalue(int arr []) {
		boolean duplicate = false;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					// System.out.println("Inside Function: "+ arr[i]+" | " +arr[j]);
					return true;
				}
			}
		}
		return duplicate;
	}
	public static void main (String args []) {
		int arr [] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(duplicatevalue(arr));
	}
}