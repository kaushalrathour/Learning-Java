package PatternAdv;

public class SolidRhombus {
    public static void solid_rhombus(int line) {
        System.out.println();
        for(int i = 1; i <= line; i++) {
            for(int spaces = 1; spaces<=(line-i); spaces++) {
                System.out.print("   ");
            }
            for(int stars = 1; stars<=line; stars++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(10);
    }
}
