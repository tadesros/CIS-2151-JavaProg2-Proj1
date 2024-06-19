package proj1;

import java.time.LocalDate; 
import java.time.Period; 


/**
 * Class: PersonHeartRate
 * This class contains a users first name, 
 * last name and birth date.
 * The class provides functions to calculate a persons age in years 
 * based from the current date.
 * This class calculates a persons maximum heart rate and target heart rate.
 * @author Tom DesRosiers
 */

public final class PersonHeartRate {
    
    //Constants
    static final double lowBPMRate = 0.5;
    static final double highBPMRate = 0.85;
    
    //Private Data
    private String firstName;
    private String lastName;
    private DateOfBirth birthDate;    
    
      
    /**
     * Method: PersonHeartRate constructor taking three parameters
     * @param firstName
     * @param lastName
     * @param birthDate 
     */
    public PersonHeartRate(String firstName, String lastName,DateOfBirth birthDate)
    {          
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;        
    }
   
    /** Getters and Setters **/  
    
    //Getter and setter for FirstName
    
    /**
     * Method: getFirstName()
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }        
    /**
     * Method setFirstName
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
    
    //Getter and setter for LastName
    
    /**
     * Method: getLastName()
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Method: setLastName
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //Getter and setter for DateOfBirth
    
    /**
     * Method: getBirthDate
     * @return birthDate
     */   
    public DateOfBirth getBirthDate() {
        return birthDate;
    }
    /**
     * Method: setBirthDate 
     * @param birthDate 
     */
    public void setBirthDate(DateOfBirth birthDate) {
        this.birthDate = birthDate;
    }
    
     /** CLASS METHODS ***/
    
    /**
     * Method: ageInYears
     * @return The age in years of the person
     */    
    public Integer ageInYears()
    {          
        // Birthdate -- year, month, or day.
        LocalDate bdate = LocalDate.of(this.birthDate.getYearOfBirth(), this.birthDate.getMonthOfBirth(), this.birthDate.getDayOfBirth()); 
  
        // Get current date and save to a localDate Object 
        LocalDate currentDate = LocalDate.now(); 
        
        // Use period class to calculate the time between current date and birthdate
        Period period = Period.between(bdate, currentDate); 
                
        //For Testing print the calculated age.
        // System.out.println("Age: " + period.getYears() + " years");  
          
        return period.getYears();        
    }
   
    /**
     * Method: maximumHeartRate
     * @return return the persons maximum heart rate
     */
    public Integer maximumHeartRate()
    {        
        return 220 - ageInYears();
    }    
    
    /**
     * Method: targetHeartRate
     * @return a string in the format -> 
     */
    public String targetHeartRate()
    {
      Integer lowTargetRate  = (int)(lowBPMRate * maximumHeartRate());
      Integer highTargetRate = (int)(highBPMRate * maximumHeartRate());
       
       return Integer.toString(lowTargetRate) + " - " +   Integer.toString(highTargetRate);
    }    
    
    /**
     * Method: printData()
     * Prints formatted values of the objects
     */
    public void printData()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("Name: "+ this.lastName + " , " + this.firstName); 
        System.out.println("Maximum Heart Rate: " + this.maximumHeartRate() + " beats per minute"); 
        System.out.println("Target Heart Rate Range: " + this.targetHeartRate() + " beats per minute"); 
        System.out.println("--------------------------------------------------");
    }
    
}
