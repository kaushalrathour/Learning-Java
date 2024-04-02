package WhileLoop;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 243;
        while(n>0) {
            int reverse = n%10;
            System.out.print(reverse);
            n/=10;
        }
    }
}
