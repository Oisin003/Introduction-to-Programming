// Practical 5B -Question 1
// Oisin - L00172671
// 25.10.2022
// Program to display the number of people needed to form a team

import java.util.Scanner;
public class Sports5BQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
     String sport;
      
      //Display prompt on screen asking the user to enter the sport name
      System.out.print("Please enter the name of your chosen sport:");
      sport = keyboardIn.nextLine();
      
         //Run the switch statement and display the results of the input on screen
         switch(sport)
         {//open switch
               case "tennis": 
               case "badminton":
                     System.out.print("1");
                     break;
               case "basketball":
                     System.out.print("5");
                     break;
                  case "hurling": 
                  case "gaelic football":
                      System.out.print("15");
                      break;
                  case "soccer":
                       System.out.print("11");
                       break;
                  default: System.out.print("Unkown sport");
               }//end switch
            } //end main method

} //end class

          