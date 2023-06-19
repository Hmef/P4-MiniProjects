package P4.example.Date.equalBeforeAfter;

import java.util.Date;

public class DisplayDate {

	public static void main(String args[]) {

		// Instantiate a objects
		Date date1 = new Date();
		Date date2 = new Date();

		
		if (date1.before(date2)) {
			// Do Something

			System.out.println(" date1.before(date2) " + date1);
		}

		if (date1.after(date2)) {
			// Do Something

			System.out.println(" date1.after(date2) ");
			System.out.println(date2.toString());
		}

		if (date1.equals(date2)) {
			// Do Something else
			
			System.out.println(" ------------- Equals ------------- ");

			System.out.println(" date1.equal(date2) --> ");
			System.out.println(date2.toString());
			System.out.println(date2);
		}

	}

}
