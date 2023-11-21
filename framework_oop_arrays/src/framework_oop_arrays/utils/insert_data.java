package framework_oop_arrays.utils;

import javax.swing.JOptionPane;

import framework_oop_arrays.classes.date_object;

public class insert_data {
	public static date_object insert_date_duration(String message_typeOfDate, String duration, String type_of_date) {
		boolean resultado = false;
		String date = "";
		date_object fecha = null;
		do {
			date = validators.valida_string(
					"Can you enter the " + message_typeOfDate + " date? Format: DD/MM/YYYY \n It has to be" + duration
							+ "days later than the date you just entered",
					type_of_date);
			resultado = regex.r_fecha(date);

			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				fecha = new date_object(date);
				if (fecha.ValidaFecha() == true) {
					resultado = true;
				} else {
					JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Error",
							JOptionPane.ERROR_MESSAGE);
					resultado = false;
				}
			}
		} while (resultado == false);
		return fecha;
	}

	public static date_object insert_date(String message_typeOfDate, String title_typeOfDate) {
		boolean resultado = false;
		String date = "";
		date_object fecha = null;
		do {
			date = validators.valida_string("Can you enter the " + message_typeOfDate + " date? Format: DD/MM/YYYY",
					title_typeOfDate);
			resultado = regex.r_fecha(date);

			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				fecha = new date_object(date);
				if (fecha.ValidaFecha() == true) {
					resultado = true;
				} else {
					JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Error",
							JOptionPane.ERROR_MESSAGE);
					resultado = false;
				}
			}
		} while (resultado == false);
		return fecha;
	}

	public static date_object insert_date_optional(String message_typeOfDate, String duration, String type_of_date) {
		boolean resultado = false;
		String date = "";
		date_object fecha = null;
		do {
			date = validators
					.valida_string_optional(
							"Can you enter the " + message_typeOfDate + " date? Format: DD/MM/YYYY \n It has to be"
									+ duration + "days later than the date you just entered, but this is optional",
							type_of_date);
			if (date.isEmpty() || date == "") {
				return fecha;
			} else {
				resultado = regex.r_fecha(date);
			}
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Errora", JOptionPane.ERROR_MESSAGE);
			} else {
				fecha = new date_object(date);
				if (fecha.ValidaFecha() == true) {
					resultado = true;
				} else {
					JOptionPane.showMessageDialog(null, "You entered a invalde date ", "Error",
							JOptionPane.ERROR_MESSAGE);
					resultado = false;
				}
			}
		} while (resultado == false);
		return fecha;
	}

	public static String insert_id(String message_ID, String title_ID) {
		boolean resultado = false;
		String id = "";

		do {
			id = validators.valida_string("Can you enter the String ID  ? Format: 3 numbers - letter Ex: 123-A",
					"Date");
			resultado = regex.r_id(id);

			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalde ID ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;

			}
		} while (resultado == false);
		return id;
	}

}
