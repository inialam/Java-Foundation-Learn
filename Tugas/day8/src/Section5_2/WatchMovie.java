package Section5_2;

//• Modify WatchMovie.java to watch a movie that
//meets the following two conditions:
//• The movie price is greater than or equal to $12
//• The movie rating is equal to 5
//􏰀Display the output as “I’m interested in watching the movie”
//􏰀Else display the output as “I am not interested in watching the movie”

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double movieTicket = sc.nextDouble();
        System.out.print("Enter the movie rating \n");
        double movieRating = sc.nextDouble();
        
        if(movieTicket>=12 && movieRating ==5)
            System.out.println("I’m interested in watching the movie");
        else
        {
            System.out.println("I am not interested in watching the movie");
        }
        
        sc.close();
     
    }
}
