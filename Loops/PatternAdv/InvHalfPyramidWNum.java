package PatternAdv;

public class InvHalfPyramidWNum {
    public static void half_pyramid_with_number (int line) {
        for(int i = 0; i<line; i++) {
            for(int j = 1; j<=(line-i); j++) {
                System.out.print(j);
            }
        System.out.println();
        }
    }
    public static void main (String args []) {
        half_pyramid_with_number(10);
    }
}
