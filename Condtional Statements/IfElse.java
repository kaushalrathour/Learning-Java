public class IfElse {
    public static void main (String args []) {
        int age = 18;
        if(age>=18) {
            System.out.println("Adult");
        }
        if(age<18 && age>=13) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Else Block Trigerred");
        };
    }
}