package PatternAdv;

public class FloydTriangle {
    public static void floyd_triangle(int line) {
        int num = 1;
        for(int i=1; i<=line; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((num+" "));
                num++;
            }
        System.out.println();
        } 
    }
    public static void main(String[] args) {
        floyd_triangle(4);
    }
}
