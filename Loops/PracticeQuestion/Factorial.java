package PracticeQuestion;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int factorial = 1;
    System.out.print("Input A Number: ");
    int num = scanner.nextInt();
    for(int i = 1; i<=num; i++) {
        factorial = factorial*i;
    }
    System.out.println("Factorial is: "+factorial);
}
}
