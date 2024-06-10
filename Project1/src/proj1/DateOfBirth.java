package proj1;

/**
 * Class: DateOf Birth
 * This class is an object to contain the date of birth 
 * contained in three Integers for Day , Month and Year
 * @author tomad
 */
public class DateOfBirth {    
    
    //Private Data
    private Integer dayOfBirth;
    private Integer monthOfBirth;
    private Integer yearOfBirth;      
        
    
    /**
     * Three parameter Constructor DateOfBirth
     * @param monthOfBirth
     * @param dayOfBirth
     * @param yearOfBirth 
     */    
    public DateOfBirth(Integer monthOfBirth, Integer dayOfBirth, Integer yearOfBirth)
    {        
        this.dayOfBirth   = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth  = yearOfBirth;        
    }    
    
    /**** Getters and Setters ******/ 
    
    //** Getter and setter for DayOfBirth **
    
    /**
     * Method: getDayOfBirth()
     * @return dayOfBirth
     */
    public Integer getDayOfBirth() {
        return dayOfBirth;
    }
    /**
     * Method: setDayOfBirth()
     * @param dayOfBirth 
     * return the day of Birth
     */
    public void setDayOfBirth(Integer dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
 
    //** Getter and setter for MonthOfBirth **
    
    /**
     * Method: getMonthOfBirth()
     * @return monthOfBirth
     */
    public Integer getMonthOfBirth() {
        return monthOfBirth;
    }
    
    /**
     * Method: setMonthOfBirth()
     * @param monthOfBirth 
     */
    public void setMonthOfBirth(Integer monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
   
    //** Getter and setter for YearOfBirth **
    
    /**
     * Method: getYearOfBirth()
     * @return yearOfBirth
     */
    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Method: setYearOfBirth()
     * @param yearOfBirth 
     */
    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }  
    
}//end class dateOfBirth
