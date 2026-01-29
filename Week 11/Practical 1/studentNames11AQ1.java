//Practical 11A - Ouestion 1
//Oisin - L00172671
//13.12.2022
//Program that uses an array to store the names of five students

import java.util.Scanner;
public class studentNames11AQ1
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
     String[] names = new String[5];
     
      for(int i = 0; i < names.length; i++)
      {//open for
         System.out.println("Enter the name of student:" + (i+1));
         names[i] = keyboardIn.nextLine();
      }//close for
      
         for(int i = 0; i < names.length; i++)
         {//open for
            //Print names to screen
            System.out.println("Name of person" + (i+1) + ":" + names[i]);
         }//close for
         
            //Create blank space
            System.out.println("");
            
            for(int j =  names.length -1; j >=0; j--)
            {//open for
               
               //Print days of the names backwards
               System.out.println("Name of person" + (j+1) + ":" + names[j]);
            
             }//close for
      

      
           }//close
     }//close
      
      
