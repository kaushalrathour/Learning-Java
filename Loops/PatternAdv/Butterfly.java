package PatternAdv;
public class Butterfly {
    public static void butterfly_pattern(int line) {
        for(int i=1; i<=line; i++) {
                for(int j=1; j<=(line*2); j++) {
                    if(j<=i || j>=((line*2-i)+1)) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            // For Reverse
            for(int i=line; i>=1; i--) {
                for(int j=1; j<=(line*2); j++) {
                    if(j<=i || j>=((line*2-i)+1)) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }      
}

    

    
    public static void main(String[] args) {
        butterfly_pattern(8);
    }
}