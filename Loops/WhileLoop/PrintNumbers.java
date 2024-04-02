import java.util.Scanner;

public class PrintNumbers {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        System.out.print("Input A Range: ");
        int range = scanner.nextInt();
        while(number<=range) {
            System.out.println(number);
            number++;
        }
    }
}
