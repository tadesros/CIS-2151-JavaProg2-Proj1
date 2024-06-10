/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj1;

/**
 *
 * @author tomad
 */
public class DateOfBirth {    
    
    //Private Data
    private Integer dayOfBirth;
    private Integer monthOfBirth;
    private Integer yearOfBirth;      
   
    //Constructor
    public DateOfBirth(Integer monthOfBirth, Integer dayOfBirth, Integer yearOfBirth)
    {        
        this.dayOfBirth   = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth  = yearOfBirth;        
    }
    
    
    //  Getters and Setters  
    
    //Getter and setter for DayOfBirth
    public Integer getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Integer dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
 
    //Getter and setter for MonthOfBirth
    public Integer getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(Integer monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
   
    //Getter and setter for YearOfBirth
    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }  
    
}//end class dateOfBirth
