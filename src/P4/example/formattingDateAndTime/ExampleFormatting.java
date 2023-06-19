package P4.example.formattingDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExampleFormatting {

	
	 public static void main(String[] args) {
		 
		 
			System.out.println(" ........... LocalDate - LocalTime - LocalDateTime Objects ...........");
			
			// Display the current Date 
			LocalDate myObj = LocalDate.now(); // Create a date object
		    System.out.println(myObj); // Display the current date
			
		    // Display the current Time 
		    LocalTime myObjT = LocalTime.now();
		    System.out.println(myObjT);
		    
		    
		    // Display Current Date and Time 
		    LocalDateTime myObjDT = LocalDateTime.now();
		    System.out.println(myObjDT);
		    
		    
		    System.out.println("  ");
		    System.out.println(" ........... Formatting Date and Time ...........");
			
		    // T is used to separate the Date from the Time 
		    // 
		    LocalDateTime myDateObj = LocalDateTime.now();
		    
		    System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		    
		    String formattedDate = myDateObj.format(myFormatObj);
		    System.out.println("After formatting: " + formattedDate);
		  }
}
