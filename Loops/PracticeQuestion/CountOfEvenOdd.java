package PracticeQuestion;
import java.util.Scanner;

public class CountOfEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for(int i = 1; i<=10; i++) {
            System.out.print("Input A Number: ");
            int num = scanner.nextInt();
            if(num%2==0) {
                even++;
            }else {
                odd++;
            }
        }
    System.out.println("Odd Numbers Were: "+ odd);
    System.out.println("Even Numbers Were: "+ even);
    }
}
