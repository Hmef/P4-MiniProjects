package P4.example.Date.CompareTo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateCompareToExample {
	
	
	public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM yyyy HH:mm");
	
        String strDate1 = "1980-04-09T03:45:00 AM";
        String strDate2 = "1980-04-09T03:45:00 PM";
        String strDate3 = "09 Apr 1980 15:45";
        
        
        try {
            Date dt1 = sdf1.parse(strDate1);  // Convert String to Date 
            System.out.println("date1: " + dt1);
            
            Date dt2 = sdf1.parse(strDate2);
            System.out.println("date2: " + dt2);
            
            Date dt3 = sdf2.parse(strDate3);
            System.out.println("date3: " + dt3);
            
            System.out.println("date1 compareTo date2: " + dt1.compareTo(dt2));   // -1
            System.out.println("date2 compareTo date1: " + dt2.compareTo(dt1));   //    1
            
            System.out.println("date1 compareTo date3: " + dt1.compareTo(dt3));
            System.out.println("date2 compareTo date3: " + dt2.compareTo(dt3));
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
        }
    }

}
