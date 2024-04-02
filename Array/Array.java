import java.util.Scanner;
public class Array {

	public static void initialization () {
		int marks [] = new int[50]; // initialize an empty array
		marks [0] = 50;
		marks [1] = 63;
		marks [2] = 95;
		System.out.println("Index 0: "+marks[0]+ "\nIndex 1: "+ marks[0]+ "\nIndex 2: "+marks[2]);
	}
	
	public static void store () {
		int marks [] = {56,85,78};
		String fruits [] = {"apple", "mango", "orange"};
		System.out.println("Index 0: "+marks[0]+ "\nIndex 1: "+ marks[1]+ "\nIndex 2: "+marks[2]);
		System.out.println("Fruit 0: "+fruits[0]+ "\nFruit 1: "+ fruits[1]+ "\nFruit 2: "+fruits[2]);
	}
	
	public static void simpleInput (int size) {
		Scanner scanner = new Scanner(System.in);
		int marks[] = new int[size];
		System.out.print("Input Marks: ");
		marks [0] = scanner.nextInt();
		System.out.print("Input Marks: ");
		marks [1] = scanner.nextInt();
		System.out.print("Input Marks: ");
		marks [2] = scanner.nextInt();
		System.out.println("Index 0: "+marks[0]+ "\nIndex 1: "+ marks[1]+ "\nIndex 2: "+marks[2]);
		marks [0] = marks[0]+1;
		System.out.println("Updated Index 0: "+marks[0]);
	}
	public static void main(String args []) {
		//Scanner scanner = new Scanner(System.in);
		//initialization();
		//simpleInput(5);
		store();
	}
}