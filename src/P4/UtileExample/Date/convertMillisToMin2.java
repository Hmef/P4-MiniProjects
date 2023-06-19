package P4.UtileExample.Date;

import java.util.concurrent.TimeUnit;

public class convertMillisToMin2 {
	
	
	public static void main(String[] args)
    {
        long milliseconds = 3500000;
 
        // This method uses this formula :minutes =
        // (milliseconds / 1000) / 60;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
 
        // This method uses this formula seconds =
        // (milliseconds / 1000);
        long seconds = (TimeUnit.MILLISECONDS.toSeconds(milliseconds) % 60);
 
        // Print the answer
        System.out.format(milliseconds + " Milliseconds = " + minutes + " minutes and " + seconds + " seconds");
    }

}
