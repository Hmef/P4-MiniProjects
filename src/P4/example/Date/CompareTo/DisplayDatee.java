package P4.example.Date.CompareTo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DisplayDatee {

	public static void main(String args[]) {
		
		
		System.out.println(" ........... LocalDate - LocalTime - LocalDateTime Objects ...........");
		
		// Display the current Date 
		LocalDate myObj = LocalDate.now(); // Create a date object    
	    System.out.println(myObj); // Display the current date     Result : 2022-08-02
		
	    // Display the current Time 
	    LocalTime myObjT = LocalTime.now();
	    System.out.println(myObjT);    //  Result : 06:20:23.319
	    
	    
	    // Display Current Date and Time 
	    LocalDateTime myObjDT = LocalDateTime.now();
	    System.out.println(myObjDT);                 // Result :   2022-08-02T06:20:23.320   Date & Time 
	    
	    
	 
	    
		// Instantiate a objects
		Date date1 = new Date();
		Date date2 = new Date();
		
		System.out.println("  ");
		
		System.out.println(" ........... Date Object ........... ");
		
		System.out.println(" Date1 :  " + date1);
		
		System.out.println("  ");
		
		System.out.println(" Get the Date : " + date1.getDate());
		
		System.out.println(" Get the Day : " + date1.getDay());
		
		System.out.println(" Get Hours : " + date1.getHours());
		
		System.out.println(" Get Minutes : " + date1.getMinutes());
		
		System.out.println(" Get Secondes : " + date1.getSeconds());
		
		System.out.println(" Get Times ( Milliseconds ) :  " + date1.getTime()); // résultat est en  Millisecondes 
		
		System.out.println("  ");
		
		
		System.out.println("  ");
		
		
		System.out.println(" Date2 : "+ date2);
		
		// setHours
		date2.setHours(12);
		System.out.println(date2.getHours());
		
		System.out.println("Date update : " + date2);
		
		System.out.println("  ");
		
		
		// Compare date1 and date2

		if (date1.compareTo(date2) > 0) {
			
			System.out.println("Date1 is after Date2");
			
		} else if (date1.compareTo(date2) < 0) {
			
			System.out.println("Date1 is before Date2");
			
		} else {
			
			System.out.println(" Date1 is equal to Date2 ");
			
		}

	}
}
