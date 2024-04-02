import java.lang.Integer;
public class MaxInArray {
	public static int maxInArray(int numbers []) {
		int largest = Integer.MIN_VALUE; // -infinity
		
		for(int i = 0; i<numbers.length; i++) {
			if(largest<numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
		
	}
	
	public static int minInArray (int numbers []) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	public static void main(String args []) {
		int numbers [] = {-1, -2, -4, -6};
		System.out.println("Maximum Is: "+maxInArray(numbers));
		System.out.println("Minimum Is: "+minInArray(numbers));
	}
}