import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int side = scanner.nextInt();
    float area = side * side;
    System.out.println("Area: "+ area);
    // System.out.println("Average: "+area);
}
}
