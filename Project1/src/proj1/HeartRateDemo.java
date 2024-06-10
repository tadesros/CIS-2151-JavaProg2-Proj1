/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
         System.out.println("Maximum BPM: " + heartRateList.getFirst().maximumHeartRate());
         System.out.println(heartRateList.getFirst().targetHeartRate());
        // Display student information         
          
    } //end main    
   
} //end demo class
