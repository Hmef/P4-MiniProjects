package P4.UtileExample.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateToStringExample {
	
	
	 public static void main(String[] args) {
		 
		 
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        String strDate = "07/07/2019 14:16:55";        
	        try {
	            Date date = sdf.parse(strDate);
	            System.out.println("date: " + date); // implicitely call toString()
	            System.out.println("date toString(): " + date.toString());
	        } catch (ParseException ex) {
	            System.out.println("ParseException occured: " + ex.getMessage());
	        }
	    }

}
