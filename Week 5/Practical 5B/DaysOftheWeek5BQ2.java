// Practical 5B -Question 2
// Oisin - L00172671
// 27.10.2022
// Program to display the days of the week
import java.util.Scanner;
public class DaysOftheWeek5BQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int day;
      
      //Display prompt on screen asking user to enter the day of the week
      System.out.print("Please enter the day of the week (ie Monday = 1):");
      day = keyboardIn.nextInt();
      
         //Run switch statement and display the message accomping the text on screen
         switch(day)
         {//open switch
            case 1:
                System.out.print("The day is Monday");
                     break;

            case 2:
                System.out.print("The day is Tuesday");
                     break;

            case 3:
                System.out.print("The day is Wednesday");
                     break;

            case 4:
               System.out.print("The day is Thursday");
                     break;
            case 5: 
            case 6:
            case 7:
               System.out.print("The weekend is here!");
                     break;
             default: System.out.print("Incorrect day");
            }//end switch
         } //end main method

} //end class

          


            

             
