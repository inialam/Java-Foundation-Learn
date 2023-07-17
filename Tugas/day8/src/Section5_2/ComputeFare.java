package Section5_2;

//• Implement the following using if/else constructs: 􏰀 
//Declare an integer variable, age
//􏰀 Have the user enter the value for age
//• Using a chained if construct, 
//compute the fare based on the age according to these conditions:
//􏰀If age is less than 11, then fare=3$
//􏰀If age is greater than 11 and less than 65, then fare=5$ 
//Else for all other ages, then fare=3$

import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;
        
        if(age<11)
            fare=3;
        else if(age>11 && age <65)
            fare=5;
        //jika age=11 atau age>65
        else
            fare=3;
        
        System.out.println("Age is "+age+" Fare is:"+fare);
        keyboard.close();

    }
}
