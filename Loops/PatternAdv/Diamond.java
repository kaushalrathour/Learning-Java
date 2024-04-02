package PatternAdv;

public class Diamond {
    public static void diamond_pattern(int line) {
        for(int i = 1; i<=line; i++) {
            for(int spc = 1; spc<=(line-i); spc++) {
                System.out.print("  ");
            }
            for(int stars = 1; stars<=(2*(i-1)+1); stars++) {
                System.out.print("* ");
            }
        System.out.println();
        }
        // Reverse 
        for(int i = line; i>=1; i--) {
            for(int spc = 1; spc<=(line-i); spc++) {
                System.out.print("  ");
            }
            for(int stars = 1; stars<=(2*(i-1)+1); stars++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_pattern(4);
    }
}
