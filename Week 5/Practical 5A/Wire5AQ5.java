// Practical 5A - Question 5
// Oisin  - L00172671
// 25.10.2022
// Program to determine the value of a wire

import java.util.Scanner;
public class Wire5AQ5
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Assign value to variable
      char wire;
      
      //Display prompt on screen asking use to enter value for the wire
      System.out.print("Please enter the wire type");
      wire = keyboardIn.next().charAt(0);
      
         //Run switch statement and then display the value of the wire on screen
         switch(wire)
         {//open switch
               case 'e': 
               case 'E':
                     System.out.print("Earth-Green");
                     break;
               case 'n': 
               case 'N':
                     System.out.print("Netural-Blue");
                     break;
               case 'l' :
               case 'L':
                     System.out.print("Live-Brown");
                     break;
               default: System.out.print("Invaild entry - enter E,N or L");
            }//end switch
            
            } //end main method

} //end class


