package P4.UtileExample.Date;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class DurationGetExample {
	
	
	 public static void main(String[] args) {
		 
	        Duration duration = Duration.parse("P1DT8H15M10.345000S");
	        System.out.println("Duration  : " + duration);
	        System.out.println("Seconds   : " + duration.getSeconds());
	        System.out.println("Nano      : " + duration.getNano());
	        
	        //System.out.println("Minutes   : " + duration.get); il y a que getSecondes & getNano
	        
	        System.out.println("NANOS     : " + duration.get(ChronoUnit.NANOS));
	        System.out.println("SECONDS   : " + duration.get(ChronoUnit.SECONDS));
	        
	        System.out.println("\n#getUnits():");
	        
	        List<TemporalUnit> units = duration.getUnits();
	        
	        for (TemporalUnit unit : units) {
	            System.out.println("- " + unit);
	        }        
	    }

}
