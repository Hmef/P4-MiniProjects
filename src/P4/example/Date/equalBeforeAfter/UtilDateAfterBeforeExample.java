package P4.example.Date.equalBeforeAfter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateAfterBeforeExample {
	
	
	
	public static void main(String[] args) {
		
		
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
      
        String strDate1 = "06-07-2019 04:07 PM";
        String strDate2 = "06-07-2019 10:20 AM";
        
        
        try {
            Date date1 = sdf.parse(strDate1);
            System.out.println("date1: " + date1);
            
            Date date2 = sdf.parse(strDate2);
            System.out.println("date2: " + date2);
 
            System.out.println("date1 after date2: " + date1.after(date2));
            System.out.println("date2 after date1: " + date2.after(date1));
            
            System.out.println("date1 before date2: " + date1.before(date2));
            System.out.println("date2 before date1: " + date2.before(date1)); 
            
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
        }
    }

}
