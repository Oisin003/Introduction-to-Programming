import java.util.Scanner;
public class examMarks
{
 public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);

         
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
     int noStudents = 0;
     
     //Get user input
     System.out.println("How many people are there");
     noPeople = keyboardIn.nextInt();
     
     int [] mark = new int [noStudents];


            //Declare variables
            int mark, totalP=0,totalF=0, average=0;
            
            for(int count = ; count < marks.length;count++)
            {//open for
               //Display prompt asking the user to enter a mark
               System.out.println("Please enter the students mark");
               mark = keyboardIn.nextInt();

average = mark * count++ / mark.length
               
                  if(mark > 40 && mark <= 100)
                  {//open if
                  
                     totalP++;
                     
                  }//close if
                  
                  else if(mark > 0 && mark < 40)
                  {//open else if
                     
                     totalF++;
                     
                  }//close else if
                  
                  else
                  {//open else
                  
                     //Display error message
                     System.out.println("Invalid");
                  }//close else
                  
               }//close for

               //Peform Cal to work out overall average Mark

               
                  //Display number of passes
                  System.out.println("Number of passes" +totalP);
                  //Display number of fails
                  System.out.println("Number of fails" + totalF);

                  //Display average mark

                  System.out.println("Total average mark:" + average);
                  
                  }//close
               }//close             
               
            
             
   