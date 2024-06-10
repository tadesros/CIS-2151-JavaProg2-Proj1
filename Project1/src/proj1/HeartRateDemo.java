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
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
          
        //
         heartRateList = new ArrayList<>();
        
         DateOfBirth personDateOfBirth = new DateOfBirth(9, 20,2010);
         
          heartRateList.add( new PersonHeartRate("Tom", "desosiers",personDateOfBirth));
          
        // Add students to the classroom
       
        // Display student information  
        
       heartRateList.getFirst().printData();
          
    } //end main    
   
} //end demo class
