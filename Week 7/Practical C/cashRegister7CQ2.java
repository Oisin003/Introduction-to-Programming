//Practical 7C - Question 2
//Oisin - L00172671
//17.11.2022
//Program to run cash register

import java.util.Scanner;
public class cashRegister7CQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int value1, value2, value3, total,cash, change;
      
      //Display prompt on screen
      System.out.println("Please enter the value of yoyr first item:");
      value1 = keyboardIn.nextInt();
      //Display Prompt on screen
      System.out.println("Please enter the value of the second item:");
      value2 = keyboardIn.nextInt();
      //Display prompt on screen
      System.out.println("Pleas enter the value of your third item:");
      value3 = keyboardIn.nextInt();
      
      //Assign value to variable
      total = value1 + value2 + value3;
      
      //Display total amount owing
      System.out.println("Total amount owing:" + total);
      
         do{
            //Display prompt on screen
            System.out.println("Please enter cash amount");
            cash = keyboardIn.nextInt();
            //Peform Cal
            change = cash - total;
            //Display change on screen
            System.out.println("Your change is:"+change);
            }while(total > cash);
            //openif
            if(cash < total)
            {
               //Display prompt on screen
               System.out.println("Please re-enter the cash amount");
               cash = keyboardIn.nextInt();
               //Peform cal
               change = total - cash;
               //Display change
               System.out.println("Change due:" + change);
            }
           
           
           } //end main method

} //end class

               
