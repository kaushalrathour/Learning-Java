package Patterns;

// public class CharacterPattern {
//     public static void main(String[] args) {
//         int n = 4;
//         int character = 65;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print((char)character);
//                 character++;
//             }
//             System.out.println();
//         }
//     }
// } 

// Mam Code ----

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char character = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }
}

