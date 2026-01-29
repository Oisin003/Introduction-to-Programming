//Practical 6B - Question 1
//Oisin - L00172671
//8.11.2022
//Program to display wages

//Find Job type
//Find hours worked
//Find hourly rate
//Display weekly wage

import java.util.Scanner;
public class Wages6BQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      char work, paid;
      double rate, hours, wage;
      
      //Get job Type
      System.out.print("Please enter your job type:");
      work = keyboardIn.next().charAt(0);
      //Get hourly rate
      System.out.print("Please enter your hourly rate:");
      rate = keyboardIn.nextDouble();
      //Get hours worked
      System.out.print("Please enter hours worked per week:");
      hours = keyboardIn.nextDouble();
      //Find wgen paid
      System.out.print("Please enter when you are paid:");
      paid = keyboardIn.next().charAt(0);
      
      if (work == 'P'|| work == 'p')
         {
            //Peform Cal
            wage = rate * hours;
            //Display wage on screen
            System.out.print("Your weekly wage is:" + wage);
         }
      
      else
      {
         if(paid == 'M' || paid == 'm' && work == 'f' || work =='F')
         {
            //Peform cal
            wage = (rate * hours * 52)/12;
            //Display wage
            System.out.print("Your monthly wage is:" + wage);
         }
         else if(paid == 'w' || paid == 'W' && work == 'f' || work == 'F')
         {
            //Peform cal
            wage = rate * hours;
            //Display wage
            System.out.print("Your weekly wage is:" + wage);
         }
      }
      
     } //end main method

} //end class


            
         
      
      

      
      
