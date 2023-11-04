package framework_oop_prods_sincad;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	private static final String Expresion_fecha="^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
	
	//validar fecha
	public static boolean r_fecha(String fecha){
        Pattern pattern=Pattern.compile(Expresion_fecha);
        Matcher matcher = pattern.matcher(fecha);
		if(matcher.matches()){
		return true;
		  } 
	    return false; 
	  }	
}
