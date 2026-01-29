// Practical 10A -Question 8
// Oisin - L00172671
// 7.12.2022
// Program to display the days of the week
import java.util.Scanner;
public class DaysOftheWeek10AQ8
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);

      int day;
      
      String daysOfWeek [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      
      //Get user input
      System.out.println("Enter a day (1-7):");
      day = keyboardIn.nextInt();
      
         //Run switch statement and display the message accomping the text on screen
         switch(day)
         {//open switch
            case 1:
                System.out.print(  daysOfWeek[0] + "-  weekday");
                     break;

            case 2:
                System.out.print( daysOfWeek[1] + "  - weekday");
                     break;

            case 3:
                System.out.print(daysOfWeek[2] +"- weekday");
                     break;

            case 4:
               System.out.print( daysOfWeek[3] +"- weekday");
                     break;
            case 5: 
               System.out.println( daysOfWeek[4]+ "- weekday");
                     break;
            case 6:
               System.out.println(daysOfWeek[5] + " - weekend");
                     break;
            case 7:
               System.out.print(daysOfWeek[6] + " - weekend");
                     break;
             default: System.out.print("Error");
            }//end switch
         } //end main method

} //end class

          


            

             
