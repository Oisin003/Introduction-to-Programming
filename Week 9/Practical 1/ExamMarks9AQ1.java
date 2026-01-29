// Practical 9A - Question 1
// Oisin - L00172671
// 29.11.2011
//Program to displat exam marks

import java.util.Scanner;
public class ExamMarks9AQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int noStudents=0;
      System.out.println("How many students are there");
      noStudents  = keyboardIn.nextInt();
      
      int [] marks= new int [noStudents];

         //FOR each person from 1 to 4
         //GET exam mark
         //IF exam mark is > 40 AND <= 100
         //ADD one to number of passes
         //ELSE IF exam mark is > 0 AND < 40
         //ADD one to number of fails
         //ELSE
         //Display invalid mark
         //DISPLAY number of passes
         //DISPLAY number of fails
         
            //Declare variables
            int mark, countP=0,countF=0, averageMark = 0;
            
            //Display prompt asking the user to enter a mark
               System.out.println("Please enter the students mark");
               mark = keyboardIn.nextInt();
               

            
            for(int count = 0; count < marks.length;count++)
            {//open for
                              
                  if(mark > 40 && mark <= 100)
                  {//open if
                  
                      countP++;
                     
                  }//close if
                  
                  else if(mark > 0 && mark < 40)
                  {//open else if
                     
                     countF++;
                     
                  }//close else if
                  
                  else
                  {//open else
                  
                     //Display error message
                     System.out.println("Invalid");
                  }//close else
                  
               }//close for
               
                                    System.out.println("average" + averageMark);
               
                  //Display number of passes
                  System.out.println("Number of passes" +countP);
                  //Display number of fails
                  System.out.println("Number of fails" + countF);
                  
                  }//close
               }//close             
               
            
            