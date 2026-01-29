//Practical 10B -Question 6
//Oisin - L00172671
//8.12.2022
//Program declare ages
import java.util.Scanner;
public class moreAges10BQ6
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
      
       //Declare variables
     int noPeople = 0;
     
     //Get user input
     System.out.println("How many people are there");
     noPeople = keyboardIn.nextInt();
     
     double [] ages = new double [noPeople];
     
     double average=0;
     
      for(int i = 0; i < ages.length ; i++)
      {//open for
         //Get user input
         System.out.println("Please enter the age of person" + (i+1));
         ages[i] = keyboardIn.nextDouble();
      }//close for
      
       for(int i = 0; i < 1; i++)
      {//open for
      
            //Peform Cal
            average = ages[i] / noPeople;
            //Display average age
            System.out.println("Average age:" + average);
            
       }//close for
      
      
   }//close
   
}//close
      

