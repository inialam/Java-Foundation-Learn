package Section5_1;

// Use an if/else statement to implement the following:
//􏰀Declare and initialize a boolean variable, outOfStock
//􏰀If quantity > 1, change the message variable to indicate plural
//􏰀If an item is out of stock, 
//inform the user that the item is unavailable, 
//else print the message and the total cost

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock =true;
        
        // Test quantity and modify message if quantity > 1.  
         if(quantity>1)
             message+="s";
        
        // Test outOfStock and notify user in either case.  
        if(outOfStock)
        {
            System.out.println("Item is not Available");
        }
        else
        {
            System.out.println(message);
            System.out.println("total cost :"+total);
        }
        
        
        
    }
    
}


