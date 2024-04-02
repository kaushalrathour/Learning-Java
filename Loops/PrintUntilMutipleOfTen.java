import java.util.Scanner;
public class PrintUntilMutipleOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input A Number: ");
            int number = scanner.nextInt();
            if(number%10 == 0) {
                System.out.println("Broke the loop due to multiple of 10");
                break;
            }
            System.out.println(number);
        }
    }
}
