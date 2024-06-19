
package proj1;
import java.util.ArrayList;


/**
 * Class: HeartRateDemo
 * @author Tom DesRosiers
 */
public class HeartRateDemo {

      //**DATA MEMBERS**    
     static ArrayList<PersonHeartRate> heartRateList;   
     static InputOutput ioObj;
     
     static   String strFirstName;
     static   String strLastName;
     static   int dayOfBirth;
     static   int monthOfBirth;
     static   int yearOfBirth;
     
      static  String promptFirstName = "Enter first name: ";
      static  String promptLastName =  "Enter last name: ";
      static  String promptBirthMonth = "Enter birth month:  ";
      static  String promptBirthDay = "Enter birth day: ";
      static  String promptBirthYear = "Enter birth year: ";
      static  String promptForMoreEntry = "Enter [Y] to enter another record. Any other entry will display the records.";
    
     
     /**
     * Method: Main
     * @param args the command line arguments
     */
     public static void main(String[] args) {  
        
         //Declare a HeartRateList ArrayList
         heartRateList = new ArrayList<>();  
         boolean continueChoice;
               
        //Display Program Intro
        displayProgramIntro(); 
      

       //Enter Loop Enter Records
       do{            
             //Get and Set Record Data
              getRecordData();            
            //Prompt user if they want to add another record
              continueChoice =  getUserChoice(promptForMoreEntry);
              
             //Create DateOfBirth Object with inputted DOB
              DateOfBirth personDateOfBirth = new DateOfBirth(dayOfBirth,  monthOfBirth,yearOfBirth);
                   
             //Add PersonHeartRate record to the arrayList
               heartRateList.add( new PersonHeartRate(strFirstName,strLastName,personDateOfBirth));
                          
       }while(continueChoice);
        
       
        
        //Print all records
        printRecords();
        
        
        
          
    } //end main    
    
   
     // Class Methods
     
     
     /**
      * Method: printRecords
      * Go thru all records displaying results
      */
     static void printRecords()
     {         
            // Iterating using for loop
            for (int i = 0; i < heartRateList.size(); i++) 
            {
               // Printing and display the elements in ArrayList           
                 heartRateList.get(i).printData();
            }        
                    
     }
     
     
     
     
     
     
     
     
     
     /**
      * Method: getUserChoice
      * @param prompt
      * @return true if user enters Y (not case sensitive) false for any other entry
      */
     static boolean getUserChoice(String prompt)
     {
         ioObj =  new InputOutput();
         
         String choice = ioObj.getStringInput(prompt);
         
         //Force Choice to uppercase
         choice = choice.toUpperCase();
         
         boolean result = choice.equals("Y"); 
         
         
         return result;
     }
     
    
     /**
      * Method: printProgramIntro
      */
     static void displayProgramIntro()
     {
        System.out.println("***********************************");
        System.out.println("Welcome to the HeartRate Calculator");     
        System.out.println("***********************************");
        System.out.println("");
        System.out.println("--- Record Entry ---");
     }
    

     static void getRecordData()
     {
         ioObj =  new InputOutput();
         
         setStrFirstName(ioObj.getStringInput(promptFirstName));
         setStrLastName(ioObj.getStringInput(promptLastName));
         setDayOfBirth(ioObj.getDayOfMonth(promptBirthDay));
         setMonthOfBirth(ioObj.getMonth(promptBirthMonth));
         setYearOfBirth(ioObj.getYear(promptBirthYear));         
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
     
    public static String getStrFirstName() {
        return strFirstName;
    }

    public static void setStrFirstName(String strFirstName) {
        HeartRateDemo.strFirstName = strFirstName;
    }

    public static String getStrLastName() {
        return strLastName;
    }

    public static void setStrLastName(String strLastName) {
        HeartRateDemo.strLastName = strLastName;
    }

    public static int getDayOfBirth() {
        return dayOfBirth;
    }

    public static void setDayOfBirth(int dayOfBirth) {
        HeartRateDemo.dayOfBirth = dayOfBirth;
    }

    public static int getMonthOfBirth() {
        return monthOfBirth;
    }

    public static void setMonthOfBirth(int monthOfBirth) {
        HeartRateDemo.monthOfBirth = monthOfBirth;
    }

    public static int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void setYearOfBirth(int yearOfBirth) {
        HeartRateDemo.yearOfBirth = yearOfBirth;
    }       
     
     

       
} //end heartRateDemo class
