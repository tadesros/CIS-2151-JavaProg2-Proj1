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
        String promptBirthMonth = "Enter the month of your birth ";
        
       //do - While Loop
       //Get New Person HeartRate object
       //Does user want to add another?
       //check do-while loop condition
            
     //  String strFirstName = getString(promptFirstName);
     //  String strLastName  = getString(promptLastName);
         int birthMonth = getMonth(promptBirthMonth);
       
   //    System.out.println(strFirstName);
    //   System.out.println(strLastName);
    
    System.out.println(birthMonth);
        
        //Create DateOfBirth Object with inputted DOB
         DateOfBirth personDateOfBirth = new DateOfBirth(9, 20,2010);
        
        //Add new Array List entry to the ListArray
        heartRateList.add( new PersonHeartRate("Tom", "desosiers",personDateOfBirth));
        
                  

        
       heartRateList.getFirst().printData();
          
    } //end main    
    
    
     /** CLASS METHODS ***/
    
     /**
      * Method: printProgramIntro
      */
     public static void displayProgramIntro()
     {
        System.out.println("Intro to Program");
      
     }
    
     /**
      * Prompt user for their first name
      * verify it is a string if not valid keep prompting 
      * return valid String.
      * @return 
      */
     public String getFirstName()
     {
         String name ="";
         
         return name;
     }
     
     /**
      * Prompt user for their Last Name
      * verify it is a string if not valid keep prompting 
      * return valid String.
      * @return 
      */
     public String getLastName()
     {
         String name ="";
         
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
     
     /**
      * Method: getString
      * @param prompt - Prompt the user for the data
      * @return - Input from the user not empty 
      */     
     public static String getString(String prompt)
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
     
     
     public static Integer getMonth(String prompt)
     {        
       
         Scanner scr = new Scanner(System.in);
        
         String strInput;
         
         int birthMonth;
         
         
         strInput = scr.nextLine();
         
         birthMonth = Integer.parseInt(strInput);
         
        
    
        return birthMonth;
    
     }
     
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
     public int getNextInt(String promptMessage) {
    Integer ret; //We use Integer so it can be null
    do {
        System.out.println(promptMessage);
        String str = in.nextLine(); //nextLine is cleaner and doesn't get caught on newline characters
        try {
            ret = Integer.parseInt(str);
        catch(NumberFormatException e) { //Invalid
            System.out.println("Input an integer."); 
        }
    } while(ret==null); //Loop while invalid
    return ret; //Return result, unboxed
}
     
     
} //end demo class
