package P4.UtileExample.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateGetSetTimeExample {
	
	
	public static void main(String[] args) {
		
		
        Date date1 = new Date();
        System.out.println("date1: " + date1);
        System.out.println("date1.getTime(): " + date1.getTime());
        System.out.println("date1.getTime(): " + date1.getHours());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String strDate = "09/04/1980 15:45:20";
        
        Date date2; 
        try {
            date2 = sdf.parse(strDate);
            System.out.println("date2: " + date2);
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
            date2 = new Date();
        }
        
        long time = date2.getTime();
        date1.setTime(time);
        System.out.println("after setTime() date1: " + date1);
    }

}
