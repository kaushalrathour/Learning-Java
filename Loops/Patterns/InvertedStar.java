package Patterns;
public class InvertedStar {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i<=n; i++) {
            for(int j = n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
