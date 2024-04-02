import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int number = scanner.nextInt();
        if(number>=0) {
            System.out.println(number +" is a postive number");
        } else {
            System.out.println(number +" is a negative number");
        }
    }
}
