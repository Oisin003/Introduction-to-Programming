// Practical 3A- Question 6
// Oisin - L00172671
// 11.10.2022
// Program to determin if a number is greater than 100

import java.util.Scanner;
public class EvenNumbers
 {

   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Assign vairables
      double num = 0;
      
      //Display prompt asking user to enter a number
      System.out.println("Please enter a number: ");
      num = keyboardIn.nextDouble();      
      //Assign if variable 
      if (num % 2 == 0)
      
       {
         System.out.print("Your number is even");
         }
            //Assign variable to less than 100
       if (num % 2 == 1)
         
         {
         System.out.print("Your number is odd");
         }
              
  

      
      
      
      
      
      
      
      
      
      
                    
   } //end main method

} //end class

