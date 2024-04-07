import java.lang.Integer;

public class SumMaxInSubArray2 {
	public static void kadanesAlgo (int arr []) {
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		boolean neg = true;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>0) {
				neg = false;
				break;
			}
		}if(!neg) {
		System.out.println("Negative: "+neg);
		for (int i=0; i<arr.length; i++) {
			curSum = (curSum + arr[i])< 0? 0: curSum + arr[i];
			maxSum = curSum>maxSum? curSum: maxSum;
		}
	}else {
		for(int i = 0; i<arr.length; i++) {
			maxSum = arr[i]>maxSum?arr[i]:maxSum;
		}
	}
	System.out.println("Max Sum: "+maxSum);
	}
	public static void main (String args []) {
		int arr [] = {-2, -3, -2, -3};
		kadanesAlgo(arr);
	}
}
