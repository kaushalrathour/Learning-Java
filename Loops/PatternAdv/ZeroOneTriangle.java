package PatternAdv;
public class ZeroOneTriangle {
    // public static void zero_one_triangle(int line) {
    //     for(int i = 1; i<=line; i++) {
    //         int odd = 1;
    //         int even = 0;
    //         for(int j =1; j<=i; j++) {
    //             if(i%2!=0) {
    //                 System.out.print(odd+"  ");
    //                 odd = odd==1? 0: 1;
    //             }else {
    //                 System.out.print(even+"  ");
    //                 even = even==0? 1: 0;
    //             }
    //         }
    //     System.out.println();
    //     }
    // }

// By Mam 
    public static void zero_one_triangle(int line) {
        for(int i = 1; i<=line; i++) {
            for(int j = 1; j<=i; j++) {
                if((i+j)%2==0) {
                    System.out.print("1  ");
                }else{
                    System.out.print("0  ");
                }
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_triangle(5);
    }
}
