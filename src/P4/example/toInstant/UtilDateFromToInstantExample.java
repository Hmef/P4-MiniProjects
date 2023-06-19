package P4.example.toInstant;

import java.time.Instant;
import java.util.Date;

public class UtilDateFromToInstantExample {
	
	
	public static void main(String[] args) {
		
		
        Instant instant1 = Instant.now();
        
        System.out.println(" Instant1 : " + instant1);
        
        Date date1 = Date.from(instant1);
        System.out.println("date: " + date1);
        
        Instant instant2 = date1.toInstant();
        System.out.println("instant1 equals instant2: " + instant1.equals(instant2));
        
        
        System.out.println("  ");
        long now = System.currentTimeMillis();
        
        System.out.println(" now --> System.currentTimeMillis : "+ now);
        
        
        System.out.println("  ");
        Date date2 = new Date(now);
        System.out.println("date2: " + date2);
        Instant instant3 = date2.toInstant();
        System.out.println("instant3: " + instant3);
        
        Date dateee = new Date();
        System.out.println("dateee: " + dateee );
        
        // Calculer le temps 
        Date inTime = new Date();
        inTime.setTime( System.currentTimeMillis() - (  24 * 60 * 60 * 1000) );
        System.out.println(" in Time  : " + inTime);
        
        
        
        
    }

}
