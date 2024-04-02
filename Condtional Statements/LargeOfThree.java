import java.util.Scanner;
public class LargeOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>=b && a>=c) {
            System.out.println("A Is Greater Among Three");
        }else if(b>=a && b>=c) {
            System.out.println("B Is Greater Among Three");
        }
        else{
            System.out.println("C Is Greater Among Three");
        }
    }
}
