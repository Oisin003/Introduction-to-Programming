// Practical 4C - Question 1
// Oisin - L00172671
// 20.10.2022
// Program to display wages

import java.util.Scanner;
public class Wages4CQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double hours, rate, wages, pay;
      
      //Display prompt on screen asking user to enter their hours worked
      System.out.print("Please enter hours worked: ");
      hours = keyboardIn.nextDouble();
      // Display prompt on screen asking user to enter their rate 
      System.out.print("Please enter your rate: ");
      rate = keyboardIn.nextDouble();
      
         //Peform cal to work out wages earned
         wages = (rate * hours);
         
            if ( hours > 42)
            {
            //peform cal to work out wages and add on a bonus 

               wages= wages + (wages * 0.2);
                //Display wages on screen
            System.out.print("Your wages are: " +wages);

            }
            else if ( hours > 40)
            {
            //peform cal to work out wages and add on a bonus 

               wages= wages + (wages * 0.15);
                //Display wages on screen
            System.out.print("Your wages are: " +wages);

            }
                          
            else if ( hours > 37)
            {
            //peform cal to work out wages and add on a bonus 

               wages = wages + (wages *0.1);
                //Display wages on screen
            System.out.print("Your wages are: " +wages);

            }
            else
            {
               System.out.print("error");
            }
                        
         } //end main method

} //end class
 
            
      

