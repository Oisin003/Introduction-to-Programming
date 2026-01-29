//Practical 11A -Question 4
//Oisin - L00172671
//13.12.2022
//Program that will use an array to store the name of 7 students

import java.util.Scanner;

public class agesOfStudents11AQ4
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
     Scanner keyboardIn = new Scanner(System.in);
     
       int [] studentAges = new int [7];

        
        int over21 = 0;
          
          for(int i = 0; i < studentAges.length; i++)
            {//open for   
               //Get user input
               System.out.println("Enter the age of the" + (i+1) + "student");
               studentAges[i] = keyboardIn.nextInt();       
            }//close for
      int largestYet = studentAges[0];
      int smallestYet = studentAges[0];
            
           for(int i = 0; i < studentAges.length; i++)
            {//open for                            
                  if(studentAges[i] == 21)
                  {//open if
                     over21++;
                  }//close if
                  
                  if(studentAges[i] > largestYet)
                  {
                     largestYet = studentAges[i];
                  } 
                  
                  if(studentAges[i] < smallestYet)
                  {
                     smallestYet =studentAges[i];
                  } 
                  
            }//close for
                        
               //Display number of 21s given
               System.out.println("Number of students aged 21:" + over21);
               System.out.println("The oldest student is:" + largestYet);
               System.out.println("The youngest student is:" + smallestYet);
            
         }//close
         
      }//close

      
