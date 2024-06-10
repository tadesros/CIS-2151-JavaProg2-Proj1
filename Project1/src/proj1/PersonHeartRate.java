/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj1;


// Importing required classes 

import java.time.LocalDate; 
import java.time.Period; 


/**
 *
 * @author tomad
 */
public final class PersonHeartRate {
    
    //Constants
    static final double lowBPMRate = 0.5;
    static final double highBPMRate = 0.85;
    
    //Private Data
    private String firstName;
    private String lastName;
    private DateOfBirth birthDate;    
    
      
    //Constructor
    public PersonHeartRate(String firstName, String lastName,DateOfBirth birthDate)
    {  
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        
    }
   
    // Getters and Setters  
    
    //Getter and setter for FirstName
    public String getFirstName() {
        return firstName;
    }        
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
    
    //Getter and setter for LastName
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //Getter and setter for DateOfBirth
    public DateOfBirth getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(DateOfBirth birthDate) {
        this.birthDate = birthDate;
    }
    
     // Methods
    
    public Integer ageInYears()
    {  
        
        // Birthdate -- year, month, or day.
        LocalDate bdate = LocalDate.of(this.birthDate.getYearOfBirth(), this.birthDate.getMonthOfBirth(), this.birthDate.getDayOfBirth()); 
  
        // Current Date 
        LocalDate currentDate = LocalDate.now(); 
        
        
        Period period = Period.between(bdate, currentDate); 
          
          
        // Print Age 
        System.out.println("Age: " + period.getYears() + " years");  
          
         return period.getYears();        
    }
        
    //You should provide a method that calculates and returns the person’s maximum heart rate
    public Integer maximumHeartRate()
    {        
        return 220 - ageInYears();
    }    
    
    //target heart rate range
    public String targetHeartRate()
    {
      Integer lowTargetRate  = (int)(lowBPMRate * maximumHeartRate());
      Integer highTargetRate = (int)(highBPMRate * maximumHeartRate());
       
       return Integer.toString(lowTargetRate) + " - " +   Integer.toString(highTargetRate);
    }
    
    public void printData()
    {
    }
    
}
