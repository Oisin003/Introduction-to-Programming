// CA1
// Oisin - L00172671
// 10.11.2022
// Program to determine bonus and wage

//GET employee type
//GET salary
//GET years worked
//Get cars sold this month
//GET vans sold this month
//Peform cal to work out monthly wage
//Pefrom cal to work out carbonus
//Pefotm cal to work out vanbonus
//Peform cal to work out service bonus
//Peform cal to work out total bonus
//Display salary
//Display cars sold
//Display vans sold
//Displa monthly wage
//Display carbonus
//Display vansbonus
//Display service bonus
//Display total bonus
   
   //Declare import scanner
   import java.util.Scanner;
   //Assign name to public class
   public class CA1
   {
      public static void main(String[ ] args)
      {  
         //Declare scanner class
         Scanner keyboardIn = new Scanner(System.in);
         
         //Declare variables
         char type;
         double salary, years, car, van, mSalary, bonus, carb, vanb, yearb, totalb;
         
         //Display prompt asking the user to enter employee tuype
         System.out.print("Please enter your employee type:");
         type = keyboardIn.next().charAt(0);
         //Display prompt asking the user to enter their salery
         System.out.print("Please enter your salary:");
         salary = keyboardIn.nextDouble();
         //Display prompt asking the user to enter years worked
         System.out.print("Please enter years worked:");
         years = keyboardIn.nextDouble();
         //Display prompt asking the user to enter the number of cars sold
         System.out.print("Please enter the number of cars sold:");
         car = keyboardIn.nextDouble();
         //Display prompt asking the user to enter the number of vans sold
         System.out.print("Plese enetr the number of vans sold:");
         van  = keyboardIn.nextDouble();
         
         
         
            //If statement 
            if( type == 'm' || type == 'M')   
               {//Open if                        
                  //Display monthly pay details
                  System.out.println("Monthly pay details:");
                  //Display annual salary
                  System.out.println("Annual salary:" +salary);
                  //Peform cal to work out monthly pay details
                  mSalary = salary * 0.12;
                  //Display monthly salary
                  System.out.println("Monthly salary:" + mSalary);
               }//Close if
               
               else if (type == 'S' || type == 's')
                  {//Open else if
                    if( years > 5) 
                     {//Open if
                        //Peform cal
                        yearb = salary + 750;
                        //Display service bonus
                        System.out.println("Service bonus:" + yearb);
                     }//Close if                      
                     else if(years < 2 )                       
                       {//Open if
                         //Display monthly pay details
                         System.out.println("Monthly pay details:");
                         //Display annual salary
                         System.out.println("Annual salary:" +salary);
                         //Peform cal to work out monthly salary
                         mSalary = salary * 0.12;
                         //Display monthly salary
                         System.out.println("Monthlt salary:" + mSalary);
                         //Display message
                         System.out.println("As you have not been working here for more than 5 years you are not entitled to a bonus.");
                        }//close else if

                  if(car == 1)
                     {//open if
                        //Pefrom cal 
                        carb =salary * 0.05;
                        //Display car bonus
                        System.out.println("CarBonus:" + carb);
                     }
                      if (car > 1 && car < 5)
                        {//Open if
                           //Pefrom cal
                           carb = salary * 0.07;
                           //Display carb
                           System.out.println("Car Bonus:" + carb);
                        }//Close if
                      if( car >= 5)
                        {//Open if
                           //peform cal 
                           carb = salary + 0.1;
                           //Display car bonus
                           System.out.println("Car bonus:" + carb);
                        }//Close if
                      if (van > 0 && van <5)
                        {//Open if
                           //Peform cal
                           vanb = salary + van * 1000;
                           //Display van bonus
                           System.out.println("Van bonus:" + vanb);
                           //Display total vans sold
                           System.out.println("Total vans sold:" + van);
                        }//close if
                      if (van > 5)
                        {//Open if
                           //Peform cal
                           vanb = salary + 1200;
                           //Display van bonus
                           System.out.println("Van bonus:" + vanb);
                         }//close if
                    
                                     
                  }//close if
                  
                  else if (type != 'S' || type != 's' || type != 'M' || type != 'm')
                     {//open if 
                        //Display error message
                        System.out.println("Error");
                     }//Close if
                        
                       
                       // {//Open if
                         
                         //  System.out.println("Monthly pay details");
                         // 
                          System.out.println("Annual salary:" + salary);
                   
                         //  mSalary = salary * 0.12;
                           
                         //  System.out.println("Monthly salary:" + mSalary);
                        
                         //  System.out.println("Car bonus:" + carb);
                        
                         //  System.out.println("Van bonus:" + vanb);
                         
                         //  System.out.println("Servive bonus:" + yearb);
                        
                         //  totalb = vanb + carb + yearb;
                       
                         // System.out.println("Total bonus:" + totalb);
                         
                           System.out.println("Cars sold:" + car);
                       
                           System.out.println("Vans sold:" + van);
                       // }// close if
                     
              } //end main method
   
   } //end class
   
   
               
   
                  
   
         
   