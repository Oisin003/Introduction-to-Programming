// Practical 9A - Question 6
// Oisin - L00172671
// 1.12.2022
//Program to rework given code 
import java.util.Scanner;
public class PizzaOrder9AQ6
{
   public static void main(String[ ] args)
   {

// declare variables
 Scanner keyboardIn = new Scanner(System.in);

    //Declare variables
    double choice,mag=10,haw=12,veg=9.50, total = 0;
    
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
        choice = keyboardIn.nextDouble();   
        
         if(choice == 1)
         {//open
            total =total + mag;
         }//close
         else if(choice == 2)
         {//open else if
            total = total + haw;
         }//close
         else if(choice == 3)
         {//open else if
           total = total + veg;
         }//close else if         
        }while(choice != 0);
               
      //Display total
      System.out.println("Total:" +total );
         
     }// end main method
}//end class
