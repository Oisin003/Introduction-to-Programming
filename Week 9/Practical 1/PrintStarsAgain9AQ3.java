// Practical 9A - Ouestion 3
// Oisin - L00172671
//29.11.2022
// Program that will 10 stars in a row

import java.util.Scanner;
public class PrintStarsAgain9AQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
       
          
          for(int outer=1; outer<=3; outer++)
               {//open
               for(int inner=1; inner<=10; inner++)
               {//open
                  //Display stars
                  System.out.print("*");
               }//close
                  //Create space
                  System.out.println();
               }//close
      
         }// end main method
}//end class
