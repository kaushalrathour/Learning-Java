public class arrayAsArg {
	public static void update (int marks []) {
		for(int i = 0; i<marks.length; i++) {
			marks[i] = marks[i]+1;
		}
		System.out.println("Fun Index 0: "+marks[0]+ "\nFun Index 1: "+ marks[1]+ "\nFun Index 2: "+marks[2]);
	}
	public static void main (String args []) {
		int marks [] = {95, 75, 85};
		System.out.println("Index 0: "+marks[0]+ "\nIndex 1: "+ marks[1]+ "\nIndex 2: "+marks[2]);
		update(marks);
		System.out.println("After Update\nIndex 0: "+marks[0]+ "\nIndex 1: "+ marks[1]+ "\nIndex 2: "+marks[2]);
	}
}