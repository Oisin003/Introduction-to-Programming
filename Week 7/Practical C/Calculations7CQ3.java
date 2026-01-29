//Practical 7C - Question 3
//Oisin - L00172671
//17.11.2022
//Program to peform calulations

import java.util.Scanner;

public class Calculations7CQ3
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      char choice;
      int value1, value2, added, sub;
      
         
            //Display message on screen
            System.out.println("CALCULATIONS MENU");
            System.out.println("A: ADD");
            System.out.println("S: SUBTRACT");
            System.out.println("Q: OUIT");
            
            //Display prompt on screen
            System.out.print("Please select one of the above options");
            choice = keyboardIn.next().charAt(0);
            
            //open
            switch(choice){
               case 'a':
               case 'A':
                  //Display prompt on screen
                  System.out.println("Please enter a value:");
                  value1 = keyboardIn.nextInt();
                  //Display prompt on screen
                  System.out.println("Please enter another value:");
                  value2 = keyboardIn.nextInt();
                  //Peform Cal
                  added = value1 + value2;
                  //Display added values
                  System.out.println("Added vaules:" +added);
                     break;
                  case 's':
                  case 'S':
                  //Display prompt on screen
                  System.out.println("Please enter a value:");
                  value1 = keyboardIn.nextInt();
                  //Display prompt on screen
                  System.out.println("Please enter another value:");
                  value2 = keyboardIn.nextInt();
                  //Peform Cal
                  sub = value1 - value2;
                  //Display subtracted value on screen
                  System.out.println("Subtracted values:" + sub);
                     break;
                  case 'q':
                  case 'Q':
                  //Display text on screen
                  System.out.println("You have chosen to quit");
                     break;
                  default: System.out.println("Invalid options");
               }//close switch
                 } //end main method

} //end class
                 
            
                          
                  
      