package PracticeQuestion;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input A Number: ");
        int n = scanner.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n+ " x "+i+" = "+(n*i));
        }
    }
}