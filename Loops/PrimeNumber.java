import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input A Number: ");
        int num = scanner.nextInt();
        if(num<=2) {
            if(num!=2) {
                System.out.println("Not A Prime Number");
            } 
            else {
                System.out.println("Prime Number");
            }
        } else {
            boolean check = true;
            for(int i =2; i<num; i++) {
                if(num%i == 0) {
                    System.out.println("Not A Prime Number");
                    check = false;
                    break;
                }
                }
        if(check) {
            System.out.println("Prime Number");
        }
        }
    }
}
