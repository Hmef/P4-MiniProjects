package P4.example.CompareToString;

public class ExampleStringComapre {
	
	
	public static void main(String[] args) {
		
		
		// Difference between the 2 methods equal() and compareTo()
		
	    String myStr1 = "Hello";
	    String myStr2 = "Hello";
	    System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
	    
	    
	    //A value less than 0 is returned if the string is less than the other string (less characters) 
	    
	    String myStrr1 = "Hello";
	    String myStrr2 = "Helloooooo";
	    System.out.println(myStrr1.compareTo(myStrr2)); // Returns -5 because they are not equal
	    
	    
	    
	    //a value greater than 0 if the string is greater than the other string (more characters)
	    
	    String myStry1 = "Helloooooo";
	    String myStry2 = "Helloo";
	    System.out.println(myStry1.compareTo(myStry2)); // Returns 4 
	    
	    
	    
	    
	    
	    // Comapre to ignore case 
	    // The comparison is based on the Unicode value of each character in the string converted to lower case.
	    
	    String myStr3 = "HELLO";
	    String myStr4 = "hello";
	    System.out.println(" Comapre To gnore Case ");
	    System.out.println(myStr3.compareToIgnoreCase(myStr4)); // Returns 0
	    
	  }

}
