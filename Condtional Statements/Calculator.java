import java.util.Scanner;

public class Calculator {
  public static void main (String args []) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int a = scanner.nextInt();
    System.out.print("Enter Operator: ");
    char operator = scanner.next().charAt(0);
    System.out.print("Enter Second Number: ");
    int b = scanner.nextInt();
    
    switch(operator) {
        case '+': System.out.println(a+b);
                    break;
        case '-': System.out.println(a-b);
        break;
        case '*': System.out.println(a*b);
        break;
        case '/': System.out.println(a%b);
        break;
        case '%': System.out.println(a%b);
        break;
        default: System.out.println("My Calculator Is Not Advanced");
    }
  }  
}
