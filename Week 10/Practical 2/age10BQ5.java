//Practical 10B -Question 5
//Oisin - L00172671
//8.12.2022
//Program declare ages

import java.util.Scanner;
public class age10BQ5
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
               
     double [] age = new double [5];
     
     double average=0;
     
      for(int i = 0; i < 5 ; i++)
      {//open for
         //Get user input
         System.out.println("Please enter the age of person" + (i+1));
         age[i] = keyboardIn.nextDouble();
      }//close for
      
       for(int i = 0; i < 1; i++)
      {//open for
      
            //Peform Cal
            average = (age[0] + age[1] + age[2] + age[3] + age[4]) / 5;
            
       }//close for
       
            //Display average age
            System.out.println("Average age:" + average);
      
      
   }
}
      

