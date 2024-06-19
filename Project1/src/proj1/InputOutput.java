package proj1;
import java.util.Scanner;

/**
 * Class: InputOutput
 * @author Tom DesRosiers
 * This class offers methods for validating user input from the console
 */
public class InputOutput {    
          
    // PUBLIC METHODS     
    
       /**
        * Method: getDayOfMonth
        * @param promptMessage - Prompt for the user
        * @return an integer representing a valid day the month 0 to 31
        */
       public int getDayOfMonth(String promptMessage) {              
                  
                  Integer number;                 
                                 
                  do{
                      
                     number = tryIntegerParse(getString(promptMessage)); 
                   
                  }while(number == null || number <=0 || number > 31);
             
                  return number;               
       } 
       
       /**
        * Method: getMonth
        * @param promptMessage - Message asking user to enter the month of birth
        * @return an integer representing a valid number for month 1 - 12 
        */
       public int getMonth(String promptMessage) {              
                  
                  Integer number;                 
                                  
                  do{
                      
                     number = tryIntegerParse(getString(promptMessage)); 
                   
                  }while(number == null || number <=0 || number > 12);
             
                  return number;               
       } 
       
        /**
        * Method: getYear
        * @param promptMessage - Message asking user to enter the month of birth
        * @return an integer representing a valid number for month: Greater than zero and 4 digits 
        */
        public int getYear(String promptMessage) {              
                  
                  Integer number;                 
             
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
         * Method: getStringInput
         * verify it is a string if not valid keep prompting 
         * return valid String.
        * @param promptMessage
         * @return 
         */
        public String getStringInput(String promptMessage)
        {
            String name ="";         

            do{         
                       name = getString(promptMessage);      

            }while(isNumber(name));

            return name;
        }
    
    //MEMBER FUNCTIONS
       
        /**
        * Method: tryParse
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
       
        /**
        * Method: getString
        * @param prompt - Prompt the user for the data
        * @return - Verify that the string is not empty
        */   
        static String getString(String prompt)
        {
           Scanner scnr = new Scanner(System.in);
           String input;

          //Check if empty or zero length
          do
          {
              System.out.println(prompt);
              input = scnr.nextLine();
          }
          while(input == null || input.trim().length() == 0);


          return input;
       }         

       /**
             * Method: isNumber
             * @param s
             * @return return true if String is a number
             *         or false if it is not a number.
             */
       static boolean isNumber(String s) {
                    for (int i = 0; i < s.length(); i++) {
                        if (!Character.isDigit(s.charAt(i))) {
                            return false;
                        }
                }
                return true;
            }           
              
} //end class InputOutput
