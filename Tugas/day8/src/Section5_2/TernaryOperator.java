package Section5_2;

public class TernaryOperator {

    public static void main(String[] args) {
     


        int x = 4, y = 9;
//        if (y / x < 3) {
//            x += y;
//        } else {
//            x *= y;
//        }
//        System.out.println("After if stmt, x = " + x);
        
         // Use a ternary operator to perform the same logic as above.
         
//         int x = 4, y = 9;
         
//         x=y/x<3?(x+=y):(x*=y); --> jika ada compound gunakan parentheses
           x=y/x<3?x+y:x*y;
         
         System.out.println("After if stmt, x = " + x);
    }
}

      
    

