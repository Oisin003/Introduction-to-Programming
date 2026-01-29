// Practical 7A - Question 2
// Oisin - L00172671
// 15.11.2022
// Program to get results

import java.util.Scanner;
public class Results7AQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int result;
      
      //Open do
         do{
            System.out.print("Please enter your results");
            result = keyboardIn.nextInt();
            //open if
            if(result<=70)
            {
               //Display text
               System.out.println("Invalid result");
            }
         }while (result <=70);
         
         //Display result
         System.out.println("Result:" + result);
         
                 
      } //end main method

} //end class


         
         
