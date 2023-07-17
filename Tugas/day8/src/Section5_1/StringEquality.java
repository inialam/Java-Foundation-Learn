package Section5_1;

//􏰀 Declare a String variable name
//􏰀 Have the user input a value for the name
//􏰀 Check whether the name is “Moe,” and then print “You are the king of rock and roll”
//􏰀 Otherwise print “You are not the king” 􏰀 Don’t use ==

import java.util.Scanner;
public class StringEquality {
   
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Name :");
        name = sc.next();
        
        //bisa menggunakan equal atau ignoreequalscase
        if(name.equalsIgnoreCase("Moe"))
        {
            System.out.println("You are the king of rock and roll");
        }
        else
        {
            System.out.println("You are not the king");
        }
        
        sc.close();
    }
    
}

