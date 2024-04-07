public class TrappedWater {
	public static int trappedWater(int height [], int width) {
		if(height.length<2) {
			return 0;
		}
		//Calculate Left Max Boundary
		int leftMaxBoundary [] = new int[height.length];
			leftMaxBoundary[0] = height[0];
		for(int i = 1; i<height.length; i++) {
			leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
		}
		//Calculate Right Max Boundary
		int rightMaxBoundary [] = new int[height.length];
			rightMaxBoundary[height.length-1] = height[height.length-1];
		for(int i = (height.length-2); i>=0; i--) {
			rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
		}
		int trapedWater = 0;
		for(int i = 0; i<height.length; i++) {
			int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
			trapedWater = trapedWater + ((waterLevel - height[i])<0?0:(waterLevel - height[i]));
		}
		return trapedWater;
		//loop
		//waterLevel = min(leftMaxBoundary, rightMaxBoundary)
		//trappedWater = waterLevel -height[i]
	}
	public static void main (String args []) {
		int height [] = {4, 2, 0, 6, 3, 2, 5};
		int width = 1;
		System.out.println(trappedWater(height, width));
	}
}