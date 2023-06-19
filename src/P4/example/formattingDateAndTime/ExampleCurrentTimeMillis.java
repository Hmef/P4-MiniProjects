package P4.example.formattingDateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleCurrentTimeMillis {
	
	
	 public static void main(String[] args) {
		 
		 
		 
	        Date date1 = new Date();
	        System.out.println("date1: " + date1);
	        System.out.println("date1.getTime(): " + date1.getTime()); // result in Milliseconds 
	 
	        
	        // System.currentTimeMillis()
	        
	        System.out.println("  ");
	        
	        System.out.println(" ------------- Current Time Millis ------------- ");
	        System.out.println("  ");
	        
	        long now = System.currentTimeMillis(); // Temps courant en Millisecondes 
	        
	        Date date2 = new Date(now);
	        System.out.println("currentTimeMillis: " + now);
	        
	        System.out.println("  ");
	        System.out.println("date2: " + date2);
	        System.out.println("date2.getTime(): " + date2.getTime());
	        
	        System.out.println("  ");
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
	        String strDate = "06-07-2019 04:07 PM";
		
	        // try and catch
	        try {
	            Date date = sdf.parse(strDate);
	            System.out.println(date);
	        	} catch (ParseException ex) {
	            System.out.println("ParseException occured: " + ex.getMessage());
	        	}
	    }

}
