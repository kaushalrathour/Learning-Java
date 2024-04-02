import java.util.Scanner;

public class IncomeTax {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        if(income > 1000000) {
            System.out.println("Tax Is 30%:");
            System.out.println("Tax To Pay: "+ (income*30/100)+ " Rupees");
        }
        else if (income > 500000) {
            System.out.println("Tax Is 20%:");
            System.out.println("Tax To Pay: "+ (income*20/100)+ " Rupees");
        }
        else {
            System.out.println("You dont need to pay the Tax");
        }
    }
}
