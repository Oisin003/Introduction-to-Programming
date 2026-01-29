// Practical 9A - Question 5
// Oisin - L00172671
// 29.11.2022
//Program to rework given code 
import java.util.Scanner;
public class PizzaOrder9AQ5
{
   public static void main(String[ ] args)
   {

// declare variables
 Scanner keyboardIn = new Scanner(System.in);

    //Declare variables
    int choice,mag=0,haw=0,veg=0;
    
    do{//open do
         //Display menu on screen
         System.out.println("Option 1 Margherita");
        
         //Display option 2
         System.out.println("Option 2 Hawaiian");
         //Display option 3
         System.out.println("Option 3 Vegetarain");
         
         //Display exit
         System.out.println("Enter 0 to exit");
        //Get user input
        System.out.println("Please enter your order");
        choice = keyboardIn.nextInt();         
            switch(choice)
            {//open switch
               case 1:
                  mag++;
                  break;
               case 2:
                  haw++;
               case 3:
                  veg++;
                  break;
               case 0:
                  break;
               default:System.out.println("Invalid option entered");
            }//close switch
           
         }while(choice != 0);
               
      //Display total
      System.out.println("Total pizzas Magherita:" + mag );
      System.out.println("Total pizzas Hawaiian:" + haw );
      System.out.println("Total pizzas Vegetarain:" + veg );
         

         

         
     }// end main method
}//end class
