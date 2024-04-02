import java.util.Scanner;

public class Sum {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input First Number");
        int a = scanner.nextInt();
        System.out.println("Please Input Second Number");
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("Sum Of A and B is = "+ sum);
        
    }
}