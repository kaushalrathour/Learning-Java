package PatternAdv;

public class HollowRhombus {
    public static void hollow_rhombus(int line) {
        for(int i = 1; i<=line; i++) {
            for(int spaces = 1; spaces<=(line-i); spaces++) {
                System.out.print(" ");
            }
            for(int stars = 1; stars<=line; stars++) {
                if(i== 1 || i == line || stars ==1 || stars==line) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
