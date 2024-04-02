package PatternAdv;
public class HollowRectanlge {
    public static void hollow_recatangle (int totalRows, int totalCols) {
        for(int i =1; i<=totalRows; i++) {
            for(int j= 1; j<=totalCols; j++) {
                if(i==1 || i==totalRows || j==1 || j==totalCols) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main (String args []) {
        hollow_recatangle(10, 5);
    }
}



// Draft 

// package PatternAdv;
// public class HollowRectanlge {
//     public static void main (String args []) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*  ");
//             }
//         System.out.println();
//         }
//     }
// }