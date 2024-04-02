package PracticeQuestion;
import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while(true) {
            System.out.println("Press 0 To Exit!");
            System.out.println("Input A Number: ");
            int num = scanner.nextInt();
            if(num == 0) {
                System.out.println();
                break;
            }
            else if(num%2==0) {
                even+=num;
            }else {
                odd+=num;
            }
        }
    System.out.println("Sum Of Odd: "+ odd);
    System.out.println("Sum Of Even: "+ even);
    }
}