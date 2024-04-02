import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input A Random Year: ");
        int year = scanner.nextInt();
        if((year % 4) ==0 && (year%100)==0 && (year%400)==0) {
            System.out.println("Not A Leap Year");
        } else {
            System.out.println("Leap Year");
        }
    }
}
