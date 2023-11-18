package test_date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class date {
	// attributes
	private String data;
	private int day;
	private int month;
	private int year;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public date (String insert_data) {
		String[] SplitArray = null;

		SplitArray = insert_data.split("/");

		this.day = Integer.parseInt(SplitArray[0]);
		this.month = Integer.parseInt(SplitArray[1]);
		this.year = Integer.parseInt(SplitArray[2]);

		this.data = insert_data;
	}	

	public Calendar toCalendar(String fecha){
		Date fechaDate = new Date();
		Calendar fechaCalendar=new GregorianCalendar();
		try{
		fechaDate = format.parse(fecha);
		fechaCalendar.setTime(fechaDate);
		}catch (ParseException e){
		e.printStackTrace();
		}
		return fechaCalendar;
		}
	
	public String deCalendartoString(Calendar cal){
	      return (cal.getTime().toString());
	   }
	
	public int comparaFechas(date fecha2){
		
		Calendar cal1 = this.toCalendar(data);
		Calendar cal2 = this.toCalendar(fecha2.toString());
		
		  if (cal1.before(cal2)) 
			  return -1; // La fecha de entrega es menor a la de devolución
		  else if (cal1.after(cal2)) 
			  return 1; // La fecha de entrega es mayor a la de devolución
		  		
		  else 
			  return 0;// La fecha de entrega es igual a la de devolución
	}
	
	public int RestaFechas(){
		int diferencia, any1, anyosistema;
		Calendar cal1=new GregorianCalendar();
		
		cal1=(toCalendar(data));
		
		any1=cal1.get(Calendar.YEAR);
		anyosistema=this.anyoactual();
		System.out.println (anyosistema);
		diferencia=anyosistema-any1;
		return diferencia;
	}
	
	public int RestaFechasMes(String fecha2){
		int diferencia, mes1, mes2;
		Calendar cal1=new GregorianCalendar();
		Calendar cal2=new GregorianCalendar();
		
		cal1=(toCalendar(data));
		cal2=(toCalendar(fecha2));
		
		mes1=cal1.get(Calendar.MONTH);
		mes2=cal2.get(Calendar.MONTH);
		
		diferencia=mes2-mes1;
		return diferencia;
	}
	
	public String getfecha() {
		return data;
	}

	public void setfecha(String data) {
		this.data = data;
	}
	
	public int anyoactual(){
        Calendar fecha = new GregorianCalendar();
        int anyo = fecha.get(Calendar.YEAR);
        return anyo;
    }
	
	@Override
	public String toString() {

		String date = null;

		date = this.day + "/" + this.month + "/" + this.year;

		return date;
	}

}