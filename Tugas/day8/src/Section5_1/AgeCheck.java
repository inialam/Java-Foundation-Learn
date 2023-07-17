package Section5_1;

public class AgeCheck {
   
//    􏰀The program has a logic problem
//􏰀For some values, it prints the wrong answer
//􏰀Find the problems and fix them. (You may need to run the program a few times and try different values to see which ones fail)
//􏰀Replace the two if statements with an if/else statement
    
    public static void main(String[] args) {
        int myAge = 16;   // I am 19; let me see if I can drive yet
        
        if (myAge > 16) {
            System.out.println("I'm old enough to have a driver's license!");
        }
//        if (myAge <= 16) {
//            System.out.println("I'm not old enough yet... :*(");
//        }

//jika menggunakan else
else 
        {
            System.out.println("I'm not old enough yet... :*(");
        }
    }
}
    

