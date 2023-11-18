package framework_oop_prods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	private static final String Expresion_fecha="^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
	private static final String Expresion_id="^([0-9]{3}[-][A-Z]{1})$";

	
	public static boolean r_fecha(String date){
        Pattern pattern=Pattern.compile(Expresion_fecha);
        Matcher matcher = pattern.matcher(date);
		if(matcher.matches()){
		return true;
		  } 
	    return false; 
	  }	
	public static boolean r_id(String id){
        Pattern pattern=Pattern.compile(Expresion_id);
        Matcher matcher = pattern.matcher(id);
		if(matcher.matches()){
		return true;
		  } 
	    return false; 
	  }	
}
