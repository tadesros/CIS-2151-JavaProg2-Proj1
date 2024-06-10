/*

 */
package proj1;
import java.util.ArrayList;

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
        
        //do - While Loop
        
        //Get New Person HeartRate object
        
        //Does user want to add another?
        
        //check do-while loop condition
            
        
        //End then print all of the data
    
        
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
     
   
} //end demo class
