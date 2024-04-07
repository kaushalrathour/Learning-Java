public class CountingSorting {
	public static void printArray (int arr []) {
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("[");
			}
			System.out.print(arr[i]+" ");
			if(i==arr.length-1) {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	
	public static void increasing(int arr []) {
		int n = arr.length;
		int range = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++) {
			range = range<arr[i]?arr[i]: range;
		}
		
		int counter [] = new int [range+1];
		for(int i = 0; i<n; i++) {
			int num = arr[i];
			counter[num]++;
		}
		int j = 0;
		for(int i = 0; i<counter.length; i++) {
				while(counter[i]>0) {
					arr[j] = i;
					j++;
					counter[i]--;
				}
			}
	}
	
	public static void main(String args []) {
		int arr [] = {50, 1, 4, 1, 2, 10, 100};
		int range = 10;
		increasing(arr);
		printArray(arr);
	}
}