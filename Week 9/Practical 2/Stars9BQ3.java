// Practical 9B - Question 3
// Oisin - L00172671
// 1.12.2022
// Program to take user input and display starts

import java.util.Scanner;
public class Stars9BQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int stars;
     do{//0pen do
     //Get user input
     System.out.println("Please enter a number");
     stars = keyboardIn.nextInt();
 
      for(int outer=1; outer<=stars; outer++)
               {//open
               for(int inner=1; inner<= stars; inner++)
               {//open
                  //Display stars
                  System.out.print("*");
               }//close
                  //Create space
                  System.out.println();
               }//close
      }while(stars != 0);
         }// end main method
}//end class
