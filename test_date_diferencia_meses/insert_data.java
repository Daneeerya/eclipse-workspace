package test_date_v2;

import javax.swing.JOptionPane;

public class insert_data {
	public static String insert_date() {
		boolean resultado = false;
		String date = "";
		
		do {
			date = validators.valida_string("Can you enter the date? Format: DD/MM/YYYY", "Date"); 
			resultado = regex.r_fecha(date);
			
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;

			}
		} while (resultado == false);
		return date;
	}	
}
