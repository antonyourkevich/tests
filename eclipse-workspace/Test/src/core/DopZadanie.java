package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DopZadanie {

	public static boolean test(String testString) {
		
		Pattern p = Pattern.compile("[A-Z] {0,4} ");
		Matcher m = p.matcher(testString);
		return m.matches();

	}
	
	public static void dumbCheck(String userNameString){  
		
		
        char[] symbols = userNameString.toCharArray();  
        if(symbols.length < 1 || symbols.length > 5 ) 
        	
        
		return; 
        
        
        
        
		
		

	
	}
}
