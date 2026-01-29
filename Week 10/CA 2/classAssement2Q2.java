// CA-2 Q2
// Oisin -L00172671
// 8.12.2022
// Program to allow user to buy tickets

/*
Display welcome message
Get no. of tickets 
Get age for each person
Add each ticket sold 
Peform cal to work oput total cost of each ticket sold
Display total cost of tickets sold
Dislay total tickets sold
Display thank you message
*/

//Delcare scanner
import java.util.Scanner;
//Delcare public class
public class classAssement2Q2
{//open
   public static void main(String[ ] args)
   {//close
      //Import scanner
      Scanner keyboardIn = new Scanner(System.in);
    
      
      //Declare variables
      double  personAge, totalCost = 0, adult = 0, teen = 0, child = 0, i = 0;
      int ticketNo, choice;
      
         //Display welcome message
         System.out.println("Welcome to the ATU Christmas Pantomine");
         
         //Display menue
         System.out.println("Abult tickets - 10");
         System.out.println("Teenagers - 7.50");
         System.out.println("Children - 5");
         
               
         //Get user input
         System.out.println("Please enter the number of tickets you would like to buy");
         ticketNo = keyboardIn.nextInt();
         
         //for(int j = 0; j < ticketNo; j++)
         //{//open for
         
         do{//open do
                         
               //Display exit
               System.out.println("Enter 0 to exit");
               
              //Get user input
              System.out.println("Please enter the age of person number");
              personAge = keyboardIn.nextDouble();   
              
               if(personAge >= 18)
               {//open
                  ++adult;
                  ++i;
                  //Peform Cal
                  totalCost = totalCost + 10;
                  
               }//close
               else if(personAge <= 18 && personAge >= 13)
               {//open else if
               
                  ++teen;
                  ++i;
                  //Peform Cal
                  totalCost = totalCost + 7.50;
                  
               }//close
               else if(personAge > 0 && personAge < 13)
               {//open else if
               
                  ++child;
                  ++i;
                  //Peform Cal
                 totalCost = totalCost + 5;
                 
               }//close else if  
               
                  /*else if(ticketNo == 3)
                  {//open else if
                     
                     //Get user input
                     System.out.println("Please enter the age of person number");
                     personAge = keyboardIn.nextDouble();   
              
                      if(personAge >= 18)
                      {//open
                      ++i;
                      //Peform Cal
                      totalCost = totalCost + 10;
                  
                     }//close
                     else if(personAge <= 18 && personAge >= 13)
                     {//open else if
               
                      ++i;
                      //Peform Cal
                      totalCost = totalCost + 7.50;
                  
                     }//close
                     else if(personAge < 13)
                     {//open else if
               
                     ++i;
                     //Peform Cal
                     totalCost = totalCost + 5;
                     }//close else if
               
                     //Peform Cal
                     totalCost = totalCost * 0.15;
                     //Display total 
                     System.out.println("Total including disount:" + totalCost);
                     
                     }//close else if */
            
           }while(personAge != 0);
            
            //Display text
            System.out.println("Thank you for your order");
                        
            //Display total cost
            System.out.println("Total cost of tickets:" + totalCost);
            
            //Display total tickets sold
            System.out.println("Total tickets sold:" + i);
            //Create blank space
            System.out.println("");
            //Display total tickets sold
            System.out.println("Total adults sold:" + adult);
            //Display total tickets sold
            System.out.println("Total teenagers tickets sold:" + teen);
            //Display total tickets sold
            System.out.println("Total childrens tickets sold:" + child);
            

  }// end main method
}//end class
                              
 /*                    

    //Declare variables
    int choice,adult=0,teen=0,child=0, total = 0;
    
    do{//open do
         //Display menu on screen
         System.out.println("Option 1 adult ticket - 10");
        
         //Display option 2
         System.out.println("Option 2 teenagers ticket - 7.50");
         //Display option 3
         System.out.println("Option 3 childs ticket - 5");
         
         //Display exit
         System.out.println("Enter 0 to exit");
        //Get user input
        System.out.println("Please enter your order");
        choice = keyboardIn.nextInt();         
            switch(choice)
            {//open switch
               case 1:
                  adult++;
                  total = total + 10;
                  break;
               case 2:
                  teen++;
                  total = total + 7.50;
               case 3:
                  child++;
                  total = total + 5;
                  break;
               case 0:
                  break;
               default:System.out.println("Invalid option entered");
            }//close switch
           
         }while(choice != 0);
               
      //Display total
      System.out.println("Total adult tickets:" + adult );
      System.out.println("Total teenager tickets:" + teen );
      System.out.println("Total children tickets:" + child );
      System.out.println("Total Cost:" +total);
        
     }// end main method
}//end class
   
   */
   
   /*
   do{//open do
         //Display menu on screen
         System.out.println("Option 1 adult ticket - 10");
        
         //Display option 2
         System.out.println("Option 2 teenagers ticket - 7.50");
         //Display option 3
         System.out.println("Option 3 childs ticket - 5");
         
         //Display exit
         System.out.println("Enter 0 to exit");
        //Get user input
        System.out.println("Please enter your order");
        choice = keyboardIn.nextInt(); 
        
        }while(choice != 0);
               
      //Display total
      System.out.println("Total adult tickets:" + adult );
      System.out.println("Total teenager tickets:" + teen );
      System.out.println("Total children tickets:" + child );
      System.out.println("Total Cost:" +total);  
      
       }// end main method
}//end class
   
*/