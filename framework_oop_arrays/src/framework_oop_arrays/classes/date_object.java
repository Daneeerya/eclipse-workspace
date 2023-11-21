package framework_oop_arrays.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class date_object {
	// attributes
	private String data;
	private int day;
	private int month;
	private int year;
	private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	public String getfecha() {
		return data;
	}

	public void setfecha(String data) {
		this.data = data;
	}

	public date_object(String insert_data) {
		String[] SplitArray = null;

		SplitArray = insert_data.split("/");

		this.day = Integer.parseInt(SplitArray[0]);
		this.month = Integer.parseInt(SplitArray[1]);
		this.year = Integer.parseInt(SplitArray[2]);

		this.data = insert_data;
	}

	public static Calendar toCalendar(String fecha) {
		Date fechaDate = new Date();
		Calendar fechaCalendar = new GregorianCalendar();
		try {
			fechaDate = format.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fechaCalendar.setTime(fechaDate);
		return fechaCalendar;
	}

	public String deCalendartoString(Calendar cal) {
		return (cal.getTime().toString());
	}

	public boolean ValidaFecha() {
		if ((month < 1) || (month > 12)) {
			return false;
		}
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int max = months[month - 1];
		if (month == 2) {
			if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
				max = 29;
			}
			if ((day < 1) || (day > max)) {
				return false;
			}
		} else if ((day < 1) || (day > max)) {
			return false;
		}
		return true;
	}

	public int comparaFechas(date_object fecha2) {

		Calendar cal1 = this.toCalendar(data);
		Calendar cal2 = this.toCalendar(fecha2.toString());

		if (cal1.before(cal2))
			return -1; // La fecha de entrega es menor a la de devolución
		else if (cal1.after(cal2))
			return 1; // La fecha de entrega es mayor a la de devolución

		else
			return 0;// La fecha de entrega es igual a la de devolución
	}

	public int RestaFechas(date_object fecha) {
		int diferencia, diferenciaanyos, fecha1, fecha2, anyo1, anyo2;
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

		cal1 = (toCalendar(data));
		cal2 = (toCalendar(fecha.data));

		fecha1 = cal1.get(Calendar.DAY_OF_YEAR);
		fecha2 = cal2.get(Calendar.DAY_OF_YEAR);
		anyo1 = cal1.get(Calendar.YEAR);
		anyo2 = cal2.get(Calendar.YEAR);

		diferenciaanyos = (anyo2 - anyo1) * 365;
		diferencia = fecha2 - fecha1;
		if (diferenciaanyos == 0) {
			return diferencia;
		}
		return diferenciaanyos + diferencia;
	}

	public String actualDate() { // cambiar a current
		Calendar date = new GregorianCalendar();
		return format.format(date);
	}

	public int actualDay() {
		Calendar date = new GregorianCalendar();
		int day = date.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	public int actualMonth() {
		Calendar date = new GregorianCalendar();
		int month = date.get(Calendar.MONTH);
		return month;
	}

	public int actualYear() {
		Calendar date = new GregorianCalendar();
		int year = date.get(Calendar.YEAR);
		return year;
	}

	public String toString() {

		String date = null;

		date = this.day + "/" + this.month + "/" + this.year;

		return date;
	}

}
