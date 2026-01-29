// Practical 4B - Question 3
// Oisin - L0172671
// 20.10.2022
// Program to display phvalue


import java.util.Scanner;
public class PHVale4BQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double phValue;
      
      //Display promptmon screen asking user to enter the phvalue
      System.out.print("Please enter the phvalue:");
      phValue = keyboardIn.nextDouble();
      
         //Display phvalue table
         if( phValue < 0 || phValue > 14 )
         {
            System.out.print("Invalid entry");
         }
         else if (phValue == 7 )
         {
            System.out.print("Neutral");
         }
         else if ( phValue > 7 && phValue <= 14)
         {
            System.out.print("Alkaline");
         }
         else
         {
            System.out.print("Acidic");
         }
         
        
       } //end main method

} //end class

         
                  
