package P4.UtileExample.Date;

public class convertMillisToMin {
	
	
	
	public static void main(String[] args)
    {
        // Take Input in Long otherwise
        // overfolw occur for some inputs.
        long milliseconds = 3500000;
 
        // formula for conversion for
        // milliseconds to minutes.
        long minutes = (milliseconds / 1000) / 60;
 
        // formula for conversion for
        // milliseconds to seconds
        long seconds = (milliseconds / 1000) % 60;
 
        // Print the output
        System.out.println(milliseconds + " Milliseconds = "
                           + minutes + " minutes and "
                           + seconds + " seconds.");
    }

}
