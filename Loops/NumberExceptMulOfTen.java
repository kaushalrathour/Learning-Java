import java.util.Scanner;

public class NumberExceptMulOfTen {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number! ");
            int number = scanner.nextInt();
            if(number%10 == 0) {
                System.out.println("Skipped Mutiple Of Ten, Lol!");
                continue;
            }
            System.out.println("Number: "+number);
        }
    }
}
