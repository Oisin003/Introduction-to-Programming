// Practial 5A - Question 1
// Oisin - L00172671
// 25.10.2022
// Program to grade students

import java.util.Scanner;
public class AirTravel5DQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int price, deduction;
      char dest;
      
      //Display prompt asking user to enter the price of their destination
      System.out.print("Please enter the price of the item:");
      price = keyboardIn.nextInt();
      //Display prompt asking the user to enter destination
      System.out.print("Please state weather you are travelling in the EU or not:");
      dest = keyboardIn.next().charAt(0);
      
      //Start switch statement 
      
         switch(dest)
         {//open switch
            case 'Y':
            case 'y':
               //Display price owing on screen
               System.out.print("Price owing:" +price);
                  break;
            case 'N':
            case 'n':
               //Peform CAL to get deduction
               deduction =  price * 1 - (21/100);
               //Display price owing on screen
               System.out.print("Price owing:" + deduction);
                  break;
               default: System.out.print("Invaild entry");
            }//end switch
            
          } //end main method

} //end class

      
      
      
