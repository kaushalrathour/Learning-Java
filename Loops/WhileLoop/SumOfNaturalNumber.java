import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.print("Input A Range: ");
        int range = scanner.nextInt();
        while(i<=range) {
            System.out.println(i);
            sum += i;
            i++;
        }
    System.out.println("Sum is: "+ sum);
    }
}