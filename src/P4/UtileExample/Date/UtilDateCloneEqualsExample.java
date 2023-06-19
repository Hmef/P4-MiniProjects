package P4.UtileExample.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateCloneEqualsExample {
	
	
	public static void main(String[] args) {
		
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        
        String strDate1 = "09/04/1980 03:25:00 PM";
        String strDate2 = "1980-04-09T15:25:00";
        String strDate3 = "1980-04-09T03:25:00 PM";
       
        
        try {
        	
        	// Parse String to Produce a Date : String --> Parse --> SimpleDateFormat --> Date 
        	
            Date date1 = sdf1.parse(strDate1);
            System.out.println("date1: " + date1);
            
            Date date2 = (Date) date1.clone();
            System.out.println("date2: " + date2);
 
            Date date3 = sdf2.parse(strDate2);
            System.out.println("date3: " + date3);
            
            // wrong parsing because date string not match with date/time format (difference est a(PM) )
            Date date4 = sdf2.parse(strDate3);
            System.out.println("date4: " + date4);
            
            
            // false - different reference ??
            System.out.println("date1 == date2: " + (date1 == date2));
           
            // true
            System.out.println("date1 equals date2: " + date1.equals(date2));
            System.out.println("date1 equals date3: " + date1.equals(date3));
            System.out.println("date1 equals date4: " + date1.equals(date4));
            
        } catch (ParseException ex) {
            
        	System.out.println("ParseException occured: " + ex.getMessage());
        }
    }

}
