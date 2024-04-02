import java.util.Scanner;
public class TypeCasting {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        System.out.println("Float " + number);
        int num = (int) number;
        System.out.println("Integer "+num);
    }
}
