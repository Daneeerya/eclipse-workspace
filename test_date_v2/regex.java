package test_date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	private static final String Expresion_fecha="^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
	
	public static boolean r_fecha(String date){
        Pattern pattern=Pattern.compile(Expresion_fecha);
        Matcher matcher = pattern.matcher(date);
		if(matcher.matches()){
		return true;
		  } 
	    return false; 
	  }	
}
