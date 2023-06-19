package P4.UtileExample.Date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationInitExample {
	
	
	public static void main(String[] args) {
		
		
        Duration duration1 = Duration.ofDays(7);
        System.out.println("Duration1: " + duration1);
 
        Duration duration2 = Duration.ofHours(8);
        System.out.println("Duration2: " + duration2);
        
        Duration duration3 = Duration.ofMinutes(15);
        System.out.println("Duration3: " + duration3);
        
        Duration duration4 = Duration.ofSeconds(10);
        System.out.println("Duration4: " + duration4);
        
        Duration duration5 = Duration.ofSeconds(30, 123456789);
        System.out.println("Duration5: " + duration5);
        
        Duration duration6 = Duration.parse("P1DT8H15M10.345000S");
        System.out.println("Duration6: " + duration6);        
        
        
        // duration between time and future time 
        Duration duration7 = Duration.between(LocalDateTime.of(2019,1, 1, 0, 0), LocalDateTime.now());
        System.out.println("Duration7: " + duration7);
        
        
        
    }

}
