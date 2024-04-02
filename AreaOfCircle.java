import java.util.Scanner;
public class AreaOfCircle {
    public static void main (String args [] ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input Radius Of Circle");
        float radius = scanner.nextFloat();
        double area = Math.PI * radius * radius;
        System.out.println("Area Of " + radius +" Is " +area);
    }
}
