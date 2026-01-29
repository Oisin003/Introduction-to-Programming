//Practical 11B - Question 3
//Oisin - L00172671
//15.12.2022
//Program to store months of the year and number of days in each month

import java.util.Scanner;

public class months11BQ3
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
     Scanner keyboardIn = new Scanner(System.in);
     
     String [] months = new String []  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};
     
     int [] days = new int [] {31,28,31,30,31,30,31,31,30,31,30,31};
     
      for(int j= 0, i = 0; j < months.length && i < days.length; j++, i++)
         {//open for
            
            //Display text to screen
            System.out.println(months[j]+ ":" + days[i]);
            
            /*
            do{//open do
               
                  //Get user input
                  System.out.println("Enter a month number (1-12): Eneter -1 to stop):");
                  months[j] = keyboardIn.nextLine();
                  
                  //Display text to screen
                  System.out.println(months[j] +"has" + days[i] + "days");
                  
               }while(months[j] != -1);
               
               */
               
              /* //Get user input
                  System.out.println("Enter a month number (1-12): Eneter -1 to stop):");
                  months= keyboardIn.nextLine();
      
         //Run switch statement and then display the value of the wire on screen
         switch(months)
         {//open switch
               case 1: 
                System.out.println(months[j] +"has" + days[i] + "days");
                     break;

               case 2:
                     System.out.println(months[j] +"has" + days[i] + "days");
                     break;
               case 3:  
               System.out.println(months[j] +"has" + days[i] + "days");
               break;
               case 4:
                System.out.println(months[j] +"has" + days[i] + "days");
                break;
                case 5:
                 System.out.println(months[j] +"has" + days[i] + "days");
                 break;
                 case 6:
                  System.out.println(months[j] +"has" + days[i] + "days");
                  break;
                  case 7:
                   System.out.println(months[j] +"has" + days[i] + "days");
                   break;
                   case 8:
                    System.out.println(months[j] +"has" + days[i] + "days");
                    break;
                    case 9:
                     System.out.println(months[j] +"has" + days[i] + "days");
                     break;
                      System.out.println(months[j] +"has" + days[i] + "days");
                      case 11:
                       System.out.println(months[j] +"has" + days[i] + "days");
                       break;
                       case 12:
                        System.out.println(months[j] +"has" + days[i] + "days");
                        break;

         default: System.out.print("Invaild");
            }//end switch
            
*/
               
            
         }//close for
         
      }//close
      
   }//close


