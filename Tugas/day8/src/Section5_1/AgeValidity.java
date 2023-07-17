package Section5_1;

import java.util.Scanner;

//Modify AgeValidity.java to implement the following:
//􏰀Have users enter their age
//􏰀Declare a boolean variable, drivingUnderAge 􏰀Initialize drivingUnderAge to false
//􏰀Write a boolean expression to check if the age entered by the user is less than or equal to 18, and then set drivingUnderAge to true
//􏰀Print the value of drivingUnderAge

public class AgeValidity {

    public static void main(String[] args) {
       boolean drivingUnderAge =false;
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Input your Age :");
        int age = sc.nextInt();
       
        drivingUnderAge = age<=18;
        System.out.println("Your underDrivingAge :" +drivingUnderAge +", age :"+age);
        
        sc.close();
    }
}
