import java.util.*;
public class Input {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hello "+input);

        String name = scanner.nextLine();
        System.out.println(name);

        int number = scanner.nextInt();
        System.out.println(number);
    }
}
