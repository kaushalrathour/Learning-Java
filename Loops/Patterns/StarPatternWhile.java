package Patterns;

public class StarPatternWhile {
    public static void main(String[] args) {
        int i =1;
       
        while(i<=4) {
            int j =1; 
            while(j<=i) {
                // System.out.println("J: "+j);
                System.out.print("*");
                j++;
            }
        System.out.println();
        i++;
        }
    }
}
