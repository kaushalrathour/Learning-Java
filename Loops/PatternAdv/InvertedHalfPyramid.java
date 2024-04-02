package PatternAdv;

public class InvertedHalfPyramid {
    // Rotated
    public static void inverted_half_pyramid (int line) {
        for(int i = 1; i<=line; i++) {
            for(int spaces = (line-i); spaces>=1; spaces--) {
                System.out.print("   ");
            }
            for(int stars =1; stars<=i; stars++) {
                System.out.print("*  ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(10);
    }
}
