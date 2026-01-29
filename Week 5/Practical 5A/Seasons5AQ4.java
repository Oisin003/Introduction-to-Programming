// Practical 5A - Question 4
// Oisin - L00172671
// 25.10.2022
// Program to  assign a mounth to a season

import java.util.Scanner;
public class Seasons5AQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int month;
      
      //Display prompt on screen asking the user to enter a month
      System.out.print("Please enter a month (1-12):");
      month = keyboardIn.nextInt();
      
         //Displayswitch statement on screen to determine which season the mont will be in
         switch(month)
         {  
               case 2: case 3: case 4:
                     System.out.print("Spring");
                     break;
               case 5: case 6: case 7:
                     System.out.print("Summer");
                     break;
               case 8: case 9: case 10:
                     System.out.print("Autumn");
                     break;
               case 11: case 12:
                     System.out.print("Winter");
                     break;
               default: System.out.print("Invalid");
            }//end switch
          } //end main method

} //end class

               
      
      

