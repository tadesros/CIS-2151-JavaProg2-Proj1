/*

 */
package proj1;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tomad
 */
public class HeartRateDemo {
    
    
      //**DATA MEMBERS**    
     static ArrayList<PersonHeartRate> heartRateList;    
    
     
       /**
     * Method: Main
     * @param args the command line arguments
     */
       public static void main(String[] args) {  
        
         //Declare a HeartRateList ArrayList
         heartRateList = new ArrayList<>();
          
        //Print Intro
        displayProgramIntro(); 
        
        String promptFirstName = "Enter a first name ";
        String promptLastName =  "Enter a last name ";
        String promptBirthMonth = "Enter the birth month ";
        String promptBirthDay = "Enter the birth day ";
        String promptBirthYear = "Enter the year of birth ";
                
       //do - While Loop
       //Get New Person HeartRate object
       //Does user want to add another?
       //check do-while loop condition
            
         String strFirstName = getName(promptFirstName);
         String strLastName  = getName(promptLastName);
         int birthMonth  = getIntBirthMonth(promptBirthMonth);
         int dayOfBirth  = getIntBirthDay(promptBirthDay);
         int yearOfBirth = getIntBirthYear(promptBirthYear);
         
           
        //Create DateOfBirth Object with inputted DOB
         DateOfBirth personDateOfBirth = new DateOfBirth(dayOfBirth, birthMonth,yearOfBirth);
        
        //Add new Array List entry to the ListArray
        heartRateList.add( new PersonHeartRate("Tom", "desosiers",personDateOfBirth));
       
         heartRateList.getFirst().printData();
          
    } //end main    
    
    
     /** CLASS METHODS ***/
    
     /**
      * Method: printProgramIntro
      */
     static void displayProgramIntro()
     {
        System.out.println("Intro to Program");
      
     }
    
     /**
      * Prompt user for their first name
      * verify it is a string if not valid keep prompting 
      * return valid String.
      * @return 
      */
     static String getName(String prompt)
     {
         String name ="";         
      
         do{         
                    name = getString(prompt);      
          
         }while(isNumber(name));
          
         return name;
     }
     
     /**
      * Return Person HeartRate object
     * @param prompt
      * @return 
      
     public PersonHeartRate getPersonHeartRate()
     {
         
        //Get First Name from User
        
        //Get Last Name from User
        
        //Get Date of Birth from User
         
         
         PersonHeartRate newPersonHeartRate;
         
         return newPersonHeartRate;
     }
     */
     
 
   /*  

     public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int a; 
        System.out.println("Enter Some Input");
        try{
            a = ip.nextInt();
        }
        catch(InputMismatchException msg){
            System.out.println("Input Mismatch Exception has occured " + msg.getMessage());
        }
    }
     */
     
       /**
        * getIntBirthDay
        * @param promptMessage - Message asking user to enter the month of birth
        * @return an integer representing a valid day of birth 1 to 31 greater than zero 
        */
       static int getIntBirthDay(String promptMessage) {              
                  
                  Integer number;                 
                  String input;                   
                  do{
                      
                     number = tryIntegerParse(getString(promptMessage)); 
                   
                  }while(number == null || number <=0 || number > 31);
             
                  return number;               
       }      
       /**
        * getIntBirthMonth
        * @param promptMessage - Message asking user to enter the month of birth
        * @return an integer representing a valid number for month 1 - 12 
        */
       static int getIntBirthMonth(String promptMessage) {              
                  
                  Integer number;                 
                  String input;                   
                  do{
                      
                     number = tryIntegerParse(getString(promptMessage)); 
                   
                  }while(number == null || number <=0 || number > 12);
             
                  return number;               
       }   
       /**
        * getYearOfBirth
        * @param promptMessage - Message asking user to enter the month of birth
        * @return an integer representing a valid number for month: Greater than zero and 4 digits 
        */
        static int getIntBirthYear(String promptMessage) {              
                  
                  Integer number;                 
                  String input;  
                  Integer length;
                  
                  
                  do{
                      
                     number = tryIntegerParse(getString(promptMessage)); 
                     
                     //Get length of number represented in a string 
                     //This will allow us to check the number of digits
                     length = String.valueOf(number).length();
                     
                    
                   
                  }while(number == null || number <=0 || length != 4);
             
                  return number;               
       }        
       /**
        * Method: getString
        * @param prompt - Prompt the user for the data
        * @return - Input from the user not empty 
        */   
       static String getString(String prompt)
       {
           Scanner scnr = new Scanner(System.in);
           String input;

          //Check if empty or zero length
          do
          {
              System.out.println(prompt+"(non-empty):");
              input = scnr.nextLine();
          }
          while(input == null || input.trim().length() == 0);


          return input;
       }  
       /**
         * checkStringType
         * @param testString
         * @return 
         */
       static String checkStringType(String testString)
       {
            
            String strType;
            
                // Function returns true if all characters
                // are in the range '0' - '9'
                if (isNumber(testString)) {
                    System.out.println("Integer");
                    strType = "Integer";
                } else {
                    System.out.println("String");
                    strType = "String";
                }
    
                return strType;
        }       
       /**
             * isNumber
             * @param s
             * @return return true or false if it is a number 
             */
       static boolean isNumber(String s) {
                    for (int i = 0; i < s.length(); i++) {
                        if (!Character.isDigit(s.charAt(i))) {
                            return false;
                        }
                }
                return true;
            }        
       /**
        * tryParse
        * @param text : String value to be checked if valid Integer
        * @return  : return null if not a valid integer string or else return the integer 
        *            representation of the string.
        */
       static Integer tryIntegerParse(String text) {
                try {
                  return Integer.parseInt(text);
                } catch (NumberFormatException e) {
                  return null;
                }
        }  
       
} //end heartRateDemo class
